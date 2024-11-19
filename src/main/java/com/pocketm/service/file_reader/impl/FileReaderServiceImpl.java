package com.pocketm.service.file_reader.impl;

import com.pocketm.domain.source.Source;
import com.pocketm.domain.source.coah.json.RootCoahJson;
import com.pocketm.domain.source.coah.xml.ContentCoahXml;
import com.pocketm.domain.source.giata.xml.ResultGiataXml;
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

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Source> T read(final File file) {
        final var ext = FilenameUtils.getExtension(file.getName()).toLowerCase();
        final var baseName = FilenameUtils.getBaseName(file.getName()).toLowerCase();

        if (ext.equals("xml") && baseName.endsWith("coah")) {
            return (T) xmlFileReaderService.read(file, ContentCoahXml.class);
        } else if (ext.equals("xml") && baseName.endsWith("giata")) {
            return (T) xmlFileReaderService.read(file, ResultGiataXml.class);
        } else if (ext.equals("json") && baseName.endsWith("coah")) {
            return (T) jsonFileReaderService.read(file, RootCoahJson.class).getContent();
        } else if (ext.equals("json") && baseName.endsWith("giata")) {
            throw new UnsupportedOperationException();
        } else {
            throw new RuntimeException();
        }
    }
}
