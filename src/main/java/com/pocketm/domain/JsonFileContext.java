package com.pocketm.domain;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.OutputStream;

@Getter
@RequiredArgsConstructor
public class JsonFileContext {

    private final ObjectMapper mapper;

    private final JsonGenerator generator;

    private final OutputStream stream;

}
