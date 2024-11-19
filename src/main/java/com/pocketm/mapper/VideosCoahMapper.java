package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.VideosHotelDTO;
import com.pocketm.domain.source.coah.json.VideosHotelCoahJson;
import com.pocketm.domain.source.coah.xml.VideosHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class VideosCoahMapper {

    public VideosHotelDTO toDTO(VideosHotelCoahXml source) {
        return VideosHotelDTO.builder()
            .build();
    }

    public VideosHotelDTO toDTO(VideosHotelCoahJson source) {
        return VideosHotelDTO.builder()
            .build();
    }
}
