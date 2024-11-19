package com.pocketm.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

import java.util.List;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImagesHotelDTO {

    @JsonUnwrapped
    @JsonProperty("@attributes")
    private ImagesNodeProperties properties;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Image> image;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ImagesNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String source;

        @JacksonXmlProperty(isAttribute = true)
        private String sourceLong;

        @JacksonXmlProperty(isAttribute = true)
        private String katalogid;

        @JacksonXmlProperty(isAttribute = true)
        private String katalogname;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Image {

        private int priority;

        private String title;

        private String source;

        private String alt;

        private String category;

        private int width;

        private int height;

        private String url;
    }
}
