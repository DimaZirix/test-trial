package com.pocketm.domain.source.giata.xml;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeoDataGiataXml {

    @JsonProperty("GiataID")
    private Integer giataID;

    @JsonProperty("Latitude")
    private BigDecimal latitude;

    @JsonProperty("Longitude")
    private BigDecimal longitude;

    @JsonProperty("Accuracy")
    private Integer accuracy;
}
