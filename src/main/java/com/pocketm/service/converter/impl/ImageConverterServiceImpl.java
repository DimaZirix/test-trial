package com.pocketm.service.converter.impl;

import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.domain.dto.hotel.ImagesHotelDTO;
import com.pocketm.service.converter.ImageConverterService;
import jakarta.inject.Singleton;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Objects;
import java.util.UUID;

@Singleton
public class ImageConverterServiceImpl implements ImageConverterService {

    private static final int READ_TIMEOUT = 10000;

    @Override
    public void convert(final ContentDTO content, final Path imagePath) {
        final var images = content.getHotel().getImages();
        if (Objects.isNull(images)) {
            return;
        }

        final var imagesList = images.getImage();
        if (Objects.isNull(imagesList)) {
            return;
        }

        int localFileId = 0;
        for (final var image : imagesList) {
            download(image, localFileId++, content.getFileId(), imagePath);
        }
    }

    @SneakyThrows
    private void download(final ImagesHotelDTO.Image image, int localFileId, int contentFileId, final Path imagePath) {
        if (Objects.isNull(image.getUrl())) {
            return;
        }

        final var file = Path.of(imagePath.toString(), contentFileId + "-" + localFileId).toFile();

        final var url = new URI(image.getUrl()).toURL();
        FileUtils.copyURLToFile(url, file, READ_TIMEOUT, READ_TIMEOUT);
    }
}
