package com.pocketm.service.converter.impl;

import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.service.converter.ContentConverterService;
import com.pocketm.service.converter.FileConverterService;
import com.pocketm.service.converter.ImageConverterService;
import com.pocketm.service.source.SourceReaderService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Path;

@Slf4j
@Singleton
public class FileConverterServiceImpl implements FileConverterService {

    @Inject
    private SourceReaderService sourceReaderService;

    @Inject
    private ContentConverterService contentConverterService;

    @Inject
    private ImageConverterService imageConverterService;

    @Override
    public ContentDTO convert(final int id, final Path sourcePath, final Path imagePath) {
        log.info("Converting files with ID {}", id);

        final var source = sourceReaderService.read(id, sourcePath);

        final var content = contentConverterService.convert(id, source);

        imageConverterService.convert(content, imagePath);

        return content;
    }


}
