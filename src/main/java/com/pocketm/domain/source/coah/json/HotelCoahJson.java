package com.pocketm.domain.source.coah.json;

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
public class HotelCoahJson {

    @JsonProperty("giata_id")
    private int giataId;

    private int iff;

    private String name;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private AddressHotelCoahJson address;

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

    private TextHotelCoahJson texts;

    private USPSHotelCoahJson usps;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> additionalTexts;

    private ImagesHotelCoahJson images;

    private VideosHotelCoahJson videos;

    private AttributesHotelCoahJson attributes;

    private RatingsHotelCoahJson ratings;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> hotelAwards;
}
