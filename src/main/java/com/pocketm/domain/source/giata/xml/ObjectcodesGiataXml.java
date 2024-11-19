package com.pocketm.domain.source.giata.xml;

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
public class ObjectcodesGiataXml {

    @JacksonXmlElementWrapper(useWrapping = false)
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
