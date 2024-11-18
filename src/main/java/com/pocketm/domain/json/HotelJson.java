package com.pocketm.domain.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelJson {

    @JsonProperty("giata_id")
    private int giataId;

    private int iff;

    private String name;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private AddressHotelJson address;

    private String phone;

    private String email;

    private String url;

    @JsonProperty("update_timestamp")
    private String updateTimestamp;

    private String category;

    @JsonProperty("region_code")
    private String regionCode;

    @JsonProperty("country_name")
    private String countryName;

    private TextHotelJson texts;

    private USPSHotelJson usps;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> additionalTexts;

    private ImagesHotelJson images;

    private VideosHotelJson videos;

    private AttributesHotelJson attributes;

    private RatingsHotelJson ratings;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> hotelAwards;
}
