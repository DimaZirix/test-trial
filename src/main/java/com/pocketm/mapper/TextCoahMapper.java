package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.TextHotelDTO;
import com.pocketm.domain.source.coah.json.TextHotelCoahJson;
import com.pocketm.domain.source.coah.xml.TextHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class TextCoahMapper {

    public TextHotelDTO toDTO(TextHotelCoahXml source) {
        return TextHotelDTO.builder()
            .build();
    }

    public TextHotelDTO toDTO(TextHotelCoahJson source) {
        return TextHotelDTO.builder()
            .build();
    }
}
