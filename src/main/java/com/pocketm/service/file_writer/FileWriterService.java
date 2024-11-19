package com.pocketm.service.file_writer;

import com.pocketm.domain.JsonFileContext;
import com.pocketm.domain.dto.hotel.ContentDTO;

import java.nio.file.Path;

public interface FileWriterService {
    JsonFileContext create(Path file);

    void close(JsonFileContext file);

    void write(ContentDTO content, JsonFileContext file);
}
