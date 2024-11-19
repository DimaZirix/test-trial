package com.pocketm.service.source.impl;

import com.pocketm.domain.dto.SourceContentDTO;
import com.pocketm.domain.source.CoahSource;
import com.pocketm.domain.source.GiataSource;
import com.pocketm.service.file_reader.FileReaderService;
import com.pocketm.service.source.SourceReaderService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.nio.file.Path;

@Singleton
public class SourceReaderServiceImpl implements SourceReaderService {

    @Inject
    private FileReaderService fileReaderService;

    @Override
    public SourceContentDTO read(final int id, final Path path) {
        final var coahXMLFile = Path.of(path.toString(), id + "-coah.xml").toFile();
        final var coahJson = Path.of(path.toString(), id + "-coah.json").toFile();
        final var giataXmlFile = Path.of(path.toString(), id + "-giata.xml").toFile();
        final var giataJsonFile = Path.of(path.toString(), id + "-giata.json").toFile();

        final CoahSource coah;
        final GiataSource giata;

        if (coahXMLFile.exists()) {
            coah = fileReaderService.read(coahXMLFile);
        } else if (coahJson.exists()) {
            coah = fileReaderService.read(coahJson);
        } else {
            coah = null;
        }

        if (giataXmlFile.exists()) {
            giata = fileReaderService.read(giataXmlFile);
        } else if (giataJsonFile.exists()) {
            giata = fileReaderService.read(giataJsonFile);
        } else {
            giata = null;
        }

        return SourceContentDTO.builder()
            .coah(coah)
            .giata(giata)
            .build();
    }
}
