package com.pocketm.domain.dto.hotel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;

import java.util.List;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressHotelDTO {

    private String zip;

    private String city;

    private String country;

    private Formatted formatted;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Formatted {

        @JacksonXmlElementWrapper(useWrapping = false)
        private List<String> line;

    }
}
