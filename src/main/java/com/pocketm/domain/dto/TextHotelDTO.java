package com.pocketm.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
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
public class TextHotelDTO {

    private Text text;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Text {

        @JsonUnwrapped
        @JsonProperty("@attributes")
        private TextNodeProperties properties;

        @JacksonXmlElementWrapper(useWrapping = false)
        private List<Paragraph> paragraph;

        private String copyrightText;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TextNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String tourOperator;

        @JacksonXmlProperty(isAttribute = true)
        private String source;

        @JacksonXmlProperty(isAttribute = true)
        private String tourOperatorLong;

        @JacksonXmlProperty(isAttribute = true)
        private String id;

        @JacksonXmlProperty(isAttribute = true)
        private String name;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Paragraph {

        @JacksonXmlProperty(isAttribute = true)
        private String headline;

        @JacksonXmlProperty(isAttribute = true)
        private String description;

        @JacksonXmlText
        private String content;
    }
}
