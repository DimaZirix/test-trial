package com.pocketm.domain.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

import java.math.BigDecimal;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RatingsHotelJson {

    @JsonUnwrapped
    @JsonProperty("@attributes")
    private RatingsNodeProperties properties;

    @JsonProperty("hc_id")
    private int hcId;

    @JsonProperty("recommendation_rate")
    private BigDecimal recommendationRate;

    private BigDecimal rating;

    private int reviews;

    private String url;

    private DetailedRating detailedRating;

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RatingsNodeProperties {

        @JacksonXmlProperty(isAttribute = true)
        private String source;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DetailedRating {

        private AverageRating averageRating;

        private AverageRating hotelRating;

        private AverageRating locationRating;

        private AverageRating serviceRating;

        private AverageRating foodRating;

        private AverageRating roomRating;

        private AverageRating sportRating;

        private AverageRating recommendation;
    }

    @ToString
    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AverageRating {

        private BigDecimal overall;

        private BigDecimal single;

        private BigDecimal couple;

        private BigDecimal family;

        private BigDecimal friends;

        private BigDecimal beach;

        private BigDecimal wintersport;

        private BigDecimal other;

        private BigDecimal wellness;
    }
}
