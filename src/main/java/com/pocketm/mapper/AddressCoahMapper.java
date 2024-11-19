package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.AddressHotelDTO;
import com.pocketm.domain.source.coah.json.AddressHotelCoahJson;
import com.pocketm.domain.source.coah.xml.AddressHotelCoahXml;
import jakarta.inject.Singleton;

@Singleton
public class AddressCoahMapper {

    public AddressHotelDTO toDTO(AddressHotelCoahXml source) {
        return AddressHotelDTO.builder()
            .zip(source.getZip())
            .city(source.getCity())
            .country(source.getCountry())
            .build();
    }

    public AddressHotelDTO toDTO(AddressHotelCoahJson source) {
        return AddressHotelDTO.builder()
            .zip(source.getZip())
            .city(source.getCity())
            .country(source.getCountry())
            .build();
    }

    public AddressHotelDTO.Formatted toDTO(AddressHotelCoahXml.Formatted source) {
        return AddressHotelDTO.Formatted.builder()
            .line(source.getLine())
            .build();
    }

    public AddressHotelDTO.Formatted toDTO(AddressHotelCoahJson.Formatted source) {
        return AddressHotelDTO.Formatted.builder()
            .line(source.getLine())
            .build();
    }
}
