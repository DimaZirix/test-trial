package com.pocketm.mapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pocketm.domain.dto.hotel.ContentDTO;
import com.pocketm.domain.dto.hotel.giata.GiataHotelDTO;
import com.pocketm.domain.source.coah.json.ContentCoahJson;
import com.pocketm.domain.source.coah.xml.ContentCoahXml;
import com.pocketm.domain.source.giata.xml.ResultGiataXml;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class GiataMapper {

    public GiataHotelDTO toDTO(ResultGiataXml source) {
        final var mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.convertValue(source.getData(), GiataHotelDTO.class);

//        return GiataHotelDTO.builder()
//            .PDFfile(source.getData().getPDFfile())
//            .hotelname(source.getData().getHotelname())
//            .build();
    }
}
