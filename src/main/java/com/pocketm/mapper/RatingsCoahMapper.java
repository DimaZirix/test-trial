package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.RatingsHotelDTO;
import com.pocketm.domain.source.coah.json.RatingsHotelCoahJson;
import com.pocketm.domain.source.coah.xml.RatingsHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class RatingsCoahMapper {

    public RatingsHotelDTO toDTO(RatingsHotelCoahXml source) {
        return RatingsHotelDTO.builder()
            .build();
    }

    public RatingsHotelDTO toDTO(RatingsHotelCoahJson source) {
        return RatingsHotelDTO.builder()
            .build();
    }
}
