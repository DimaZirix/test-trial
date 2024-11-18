package com.pocketm.service.file_reader.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.pocketm.service.file_reader.JsonFileReaderService;
import jakarta.inject.Singleton;

import java.io.File;
import java.io.IOException;

@Singleton
public class JsonFileReaderServiceImpl implements JsonFileReaderService {

    @Override
    public <T> T read(File file, Class<T> clazz) {
        try {
            final var objectMapper = new JsonMapper();
            objectMapper.enable(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION);
            objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

            final var introspector = new IgnoreJsonUnwrappedAnnotationInspector();
            objectMapper.setAnnotationIntrospector(introspector);

            return objectMapper.readValue(file, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class IgnoreJsonUnwrappedAnnotationInspector extends JacksonAnnotationIntrospector {
        @Override
        public NameTransformer findUnwrappingNameTransformer(AnnotatedMember member) {
            return null;
        }
    }
}
