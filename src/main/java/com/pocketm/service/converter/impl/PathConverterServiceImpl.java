package com.pocketm.service.converter.impl;

import com.pocketm.domain.JsonFileContext;
import com.pocketm.service.converter.FileConverterService;
import com.pocketm.service.converter.PathConverterService;
import com.pocketm.service.file_writer.FileWriterService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Singleton
public class PathConverterServiceImpl implements PathConverterService {

    private final Object syncObject = new Object();

    @Inject
    private FileConverterService fileConverterService;

    @Inject
    private FileWriterService fileWriterService;

    @Override
    public void convert(final Path sourcePath, final Path destFile, final Path imagePath) {
        final var file = fileWriterService.create(destFile);

        final var fileIdsList = getFileIdList(sourcePath);

        fileIdsList.parallelStream().forEach(fileId -> convertFile(fileId, file, sourcePath, imagePath));

        fileWriterService.close(file);
    }

    private void convertFile(final int fileId, final JsonFileContext file, final Path sourcePath, final Path imagePath) {
        synchronized (syncObject) {
            final var content = fileConverterService.convert(fileId, sourcePath, imagePath);

            fileWriterService.write(content, file);
        }
    }

    private List<Integer> getFileIdList(final Path path) {
        try (final var list = Files.list(path)) {
            return list.map(p -> p.toFile().getName())
                .filter(p -> p.matches("^([0-9]+)-(coah|giata)\\.(xml|json)$"))
                .map(p -> p.replaceAll("^([0-9]+)-(coah|giata)\\.(xml|json)$", "$1"))
                .filter(p -> !p.isBlank())
                .map(Integer::parseInt)
                .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
