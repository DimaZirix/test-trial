package com.pocketm.domain.dto.hotel.giata;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;

import java.util.List;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ObjectcodesGiataHotelDTO {

    private List<Oc> oc;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Oc {

        @JacksonXmlProperty(isAttribute = true)
        private Integer seq;

        @JacksonXmlText
        private String content;
    }
}
