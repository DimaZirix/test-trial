package com.pocketm.service.file_reader;

import java.io.File;

public interface XmlFileReaderService {

    <T> T read(File file, Class<T> clazz);
}
