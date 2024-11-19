package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.AddressHotelDTO;
import com.pocketm.domain.source.coah.json.AddressHotelCoahJson;
import com.pocketm.domain.source.coah.xml.AddressHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class AddressCoahMapper {

    public AddressHotelDTO toDTO(AddressHotelCoahXml source) {
        return AddressHotelDTO.builder()
            .build();
    }

    public AddressHotelDTO toDTO(AddressHotelCoahJson source) {
        return AddressHotelDTO.builder()
            .build();
    }
}
