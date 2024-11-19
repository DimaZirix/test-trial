package com.pocketm.mapper;

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
        return GiataHotelDTO.builder()
            .hotelname(source.getData().getHotelname())
            .build();
    }
}
