package com.pocketm.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class USPSHotelDTO {

    private HotelAttributes hotelAttributes;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class HotelAttributes {

        @JsonUnwrapped
        @JsonProperty("@attributes")
        private HotelNodeProperties properties;

        @JacksonXmlElementWrapper(useWrapping = false)
        private List<Attribute> attribute;
    }
    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class HotelNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String source;

    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Attribute {

        @JsonUnwrapped
        @JsonProperty("@attributes")
        private AttributeNodeProperties properties;

        @JacksonXmlText
        private String usp;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AttributeNodeProperties {
        @JacksonXmlProperty(isAttribute = true)
        private int priority;

        @JacksonXmlProperty(isAttribute = true)
        private BigDecimal rating;
    }
}
