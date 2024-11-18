package com.pocketm.service.file_reader.impl;

import com.pocketm.domain.json.coah.ContentCoahJson;
import com.pocketm.domain.json.coah.RootCoahJson;
import com.pocketm.service.file_reader.FileReaderService;
import com.pocketm.service.file_reader.JsonFileReaderService;
import com.pocketm.service.file_reader.XmlFileReaderService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

@Singleton
public class FileReaderServiceImpl implements FileReaderService {

    @Inject
    private XmlFileReaderService xmlFileReaderService;

    @Inject
    private JsonFileReaderService jsonFileReaderService;

    @Override
    public Object read(final File file) {
        final var ext = FilenameUtils.getExtension(file.getName()).toLowerCase();
        final var baseName = FilenameUtils.getBaseName(file.getName()).toLowerCase();

        if (ext.equals("xml") && baseName.endsWith("coah")) {
            return xmlFileReaderService.read(file, ContentCoahJson.class);
        } else if (ext.equals("xml") && baseName.endsWith("giata")) {
            return jsonFileReaderService.read(file, RootCoahJson.class);
        } else if (ext.equals("json") && baseName.endsWith("coah")) {
            return jsonFileReaderService.read(file, RootCoahJson.class);
        } else if (ext.equals("json") && baseName.endsWith("giata")) {
            throw new UnsupportedOperationException();
        } else {
            throw new RuntimeException();
        }
    }
}
