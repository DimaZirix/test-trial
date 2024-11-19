package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.USPSHotelDTO;
import com.pocketm.domain.source.coah.json.USPSHotelCoahJson;
import com.pocketm.domain.source.coah.xml.USPSHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class USPSCoahMapper {

    public USPSHotelDTO toDTO(USPSHotelCoahXml source) {
        return USPSHotelDTO.builder()
            .build();
    }

    public USPSHotelDTO toDTO(USPSHotelCoahJson source) {
        return USPSHotelDTO.builder()
            .build();
    }
}
