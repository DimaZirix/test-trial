package com.pocketm.service.converter.impl;

import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.domain.dto.hotel.giata.GiataHotelDTO;
import com.pocketm.domain.source.coah.json.ContentCoahJson;
import com.pocketm.domain.source.coah.xml.ContentCoahXml;
import com.pocketm.domain.source.giata.xml.ResultGiataXml;
import com.pocketm.mapper.ContentCoahMapper;
import com.pocketm.mapper.GiataMapper;
import com.pocketm.service.converter.FileConverterService;
import com.pocketm.service.source.SourceReaderService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.nio.file.Path;

@Singleton
public class FileConverterServiceImpl implements FileConverterService {

    @Inject
    private SourceReaderService sourceReaderService;

    @Inject
    private ContentCoahMapper contentCoahMapper;

    @Inject
    private GiataMapper giataMapper;

    @Override
    public ContentDTO convert(final int id, final Path path) {
        final var source = sourceReaderService.read(id, path);

        final GiataHotelDTO giataHotelDTO;
        if (source.getGiata() instanceof ResultGiataXml giata) {
            giataHotelDTO = giataMapper.toDTO(giata);
        } else {
            throw new RuntimeException("It will never happen");
        }

        final ContentDTO result;
        if (source.getCoah() instanceof ContentCoahXml coah) {
            result = contentCoahMapper.toDTO(coah);
        } else if (source.getCoah() instanceof ContentCoahJson coah) {
            result = contentCoahMapper.toDTO(coah);
        } else {
            throw new RuntimeException("It will never happen");
        }

        result.getHotel().setGiata(giataHotelDTO);

        return result;
    }
}
