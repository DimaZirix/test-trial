package com.pocketm.service.file_writer.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pocketm.domain.JsonFileContext;
import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.service.file_writer.FileWriterService;
import jakarta.inject.Singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

@Singleton
public class FileWriterServiceImpl implements FileWriterService {

    @Override
    public JsonFileContext create(final Path file) {
        try {
            final var mapper = new ObjectMapper();
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            final var stream = new FileOutputStream(file.toFile());
            final var jsonGenerator = mapper.getFactory().createGenerator(stream);
            jsonGenerator.writeStartArray();

            return new JsonFileContext(mapper, jsonGenerator, stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close(final JsonFileContext file) {
        try {
            file.getGenerator().writeEndArray();
            file.getGenerator().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(final ContentDTO content, final JsonFileContext file) {
        try {
            file.getMapper().writeValue(file.getGenerator(), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
