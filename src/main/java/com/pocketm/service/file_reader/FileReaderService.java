package com.pocketm.service.file_reader;

import com.pocketm.domain.source.Source;

import java.io.File;

public interface FileReaderService {
    <T extends Source> T read(File file);
}
