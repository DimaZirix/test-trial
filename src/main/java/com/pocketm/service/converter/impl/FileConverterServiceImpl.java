package com.pocketm.service.converter.impl;

import com.pocketm.service.converter.FileConverterService;
import com.pocketm.service.file_reader.FileReaderService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.io.File;

@Singleton
public class FileConverterServiceImpl implements FileConverterService {

    @Inject
    private FileReaderService fileReaderService;

    @Override
    public void convert() {
        final var value = fileReaderService.read(new File("/home/user/Documents/space/personal/projects/trial_task/src/main/resources/test_data/594608-coah.json"));
        final var value2 = fileReaderService.read(new File("/home/user/Documents/space/personal/projects/trial_task/src/main/resources/test_data/3956-coah.xml"));
        final var value3 = fileReaderService.read(new File("/home/user/Documents/space/personal/projects/trial_task/src/main/resources/test_data/3956-giata.xml"));

        System.out.println(value3);
    }
}
