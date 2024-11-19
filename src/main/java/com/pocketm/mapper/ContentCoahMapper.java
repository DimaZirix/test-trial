package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.domain.source.coah.json.ContentCoahJson;
import com.pocketm.domain.source.coah.xml.ContentCoahXml;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ContentCoahMapper {

    @Inject
    private HotelCoahMapper hotelCoahMapper;

    public ContentDTO toDTO(ContentCoahXml source) {
        return ContentDTO.builder()
            .hotel(hotelCoahMapper.toDTO(source.getHotel()))
            .build();
    }

    public ContentDTO toDTO(ContentCoahJson source) {
        return ContentDTO.builder()
            .hotel(hotelCoahMapper.toDTO(source.getHotel()))
            .build();
    }
}
