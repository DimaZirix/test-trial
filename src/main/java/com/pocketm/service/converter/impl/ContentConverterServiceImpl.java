package com.pocketm.service.converter.impl;

import com.pocketm.domain.dto.SourceContentDTO;
import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.domain.dto.hotel.HotelDTO;
import com.pocketm.domain.dto.hotel.giata.GiataHotelDTO;
import com.pocketm.domain.source.coah.json.ContentCoahJson;
import com.pocketm.domain.source.coah.xml.ContentCoahXml;
import com.pocketm.domain.source.giata.xml.ResultGiataXml;
import com.pocketm.mapper.ContentCoahMapper;
import com.pocketm.mapper.GiataMapper;
import com.pocketm.service.converter.ContentConverterService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ContentConverterServiceImpl implements ContentConverterService {

    @Inject
    private ContentCoahMapper contentCoahMapper;

    @Inject
    private GiataMapper giataMapper;

    @Override
    public ContentDTO convert(final int id, final SourceContentDTO source) {
        final GiataHotelDTO giataHotelDTO;
        if (source.getGiata() instanceof ResultGiataXml giata) {
            giataHotelDTO = giataMapper.toDTO(giata);
        } else if (source.getGiata() == null) {
            giataHotelDTO = null;
        } else {
            throw new RuntimeException("It will never happen");
        }

        final ContentDTO result;
        if (source.getCoah() instanceof ContentCoahXml coah) {
            result = contentCoahMapper.toDTO(coah);
        } else if (source.getCoah() instanceof ContentCoahJson coah) {
            result = contentCoahMapper.toDTO(coah);
        } else if (source.getCoah() == null) {
            result = createEmptyContent();
        } else {
            throw new RuntimeException("It will never happen");
        }

        result.getHotel().setGiata(giataHotelDTO);
        result.setFileId(id);

        return result;
    }

    private ContentDTO createEmptyContent() {
        final var hotel = HotelDTO.builder().build();

        return ContentDTO.builder()
            .hotel(hotel)
            .build();
    }
}
