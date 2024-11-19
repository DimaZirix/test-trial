package com.pocketm.domain.source.giata.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.pocketm.domain.source.Source;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultGiataXml implements Source {

    @JacksonXmlProperty(isAttribute = true)
    private Integer found;

    private DataGiataXml data;

}