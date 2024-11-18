package com.pocketm.domain.xml.coah;

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
public class AttributesHotelCoahXml {

    @JsonUnwrapped
    @JsonProperty("@attributes")
    private AttributesNodeProperties properties;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Category> category;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AttributesNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String source;

    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Category {

        @JsonUnwrapped
        @JsonProperty("@attributes")
        private CategoryNodeProperties properties;

        @JacksonXmlElementWrapper(useWrapping = false)
        private List<Object> attribute;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CategoryNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String name;

    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Attribute {

        @JacksonXmlText
        private String content;
    }
}
