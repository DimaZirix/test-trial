package com.pocketm.domain.coah.xml;

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
public class VideosHotelCoahXml {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Video> video;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Video {

        @JsonUnwrapped
        @JsonProperty("@attributes")
        private VideoNodeProperties properties;

        private Urls urls;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VideoNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String source;

        @JacksonXmlProperty(isAttribute = true)
        private int priority;

        @JacksonXmlProperty(isAttribute = true)
        private boolean hasPlayer;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Urls {

        @JacksonXmlElementWrapper(useWrapping = false)
        private List<Url> url;
    }


    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Url {

        @JsonUnwrapped
        @JsonProperty("@attributes")
        private UrlNodeProperties properties;

        @JacksonXmlText
        private String content;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UrlNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String type;
    }

}
