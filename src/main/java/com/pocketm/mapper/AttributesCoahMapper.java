package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.AttributesHotelDTO;
import com.pocketm.domain.source.coah.json.AttributesHotelCoahJson;
import com.pocketm.domain.source.coah.xml.AttributesHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class AttributesCoahMapper {

    public AttributesHotelDTO toDTO(AttributesHotelCoahXml source) {
        return AttributesHotelDTO.builder()
            .build();
    }

    public AttributesHotelDTO toDTO(AttributesHotelCoahJson source) {
        return AttributesHotelDTO.builder()
            .build();
    }
}
