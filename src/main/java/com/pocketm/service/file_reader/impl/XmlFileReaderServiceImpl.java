package com.pocketm.service.file_reader.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pocketm.service.file_reader.XmlFileReaderService;
import jakarta.inject.Singleton;

import java.io.File;
import java.io.IOException;

@Singleton
public class XmlFileReaderServiceImpl implements XmlFileReaderService {

    @SuppressWarnings("unchecked")
    @Override
    public <T> T read(final File file, final Class<T> clazz) {
        try {
            final var objectMapper = new XmlMapper();
            objectMapper.enable(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);
            return objectMapper.readValue(file, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
