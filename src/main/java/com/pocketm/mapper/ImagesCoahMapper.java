package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.ImagesHotelDTO;
import com.pocketm.domain.source.coah.json.ImagesHotelCoahJson;
import com.pocketm.domain.source.coah.xml.ImagesHotelCoahXml;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class ImagesCoahMapper {

    public ImagesHotelDTO toDTO(final ImagesHotelCoahXml source) {
        return ImagesHotelDTO.builder()
            .image(toDTO(source.getImage()))
            .properties(toDTO(source.getProperties()))
            .build();
    }

    public ImagesHotelDTO toDTO(final ImagesHotelCoahJson source) {
        return ImagesHotelDTO.builder()
            .build();
    }

    private List<ImagesHotelDTO.Image> toDTO(final List<ImagesHotelCoahXml.Image> source) {
        return source.stream()
            .map(image ->
                ImagesHotelDTO.Image.builder()
                    .priority(image.getPriority())
                    .title(image.getTitle())
                    .alt(image.getAlt())
                    .category(image.getCategory())
                    .width(image.getWidth())
                    .height(image.getHeight())
                    .url(image.getUrl().strip())
                    .build()
            )
            .toList();
    }

    private ImagesHotelDTO.ImagesNodeProperties toDTO(final ImagesHotelCoahXml.ImagesNodeProperties source) {
        return ImagesHotelDTO.ImagesNodeProperties.builder()
            .source(source.getSource())
            .sourceLong(source.getSourceLong())
            .katalogid(source.getKatalogid())
            .katalogname(source.getKatalogname())
            .build();
    }
}
