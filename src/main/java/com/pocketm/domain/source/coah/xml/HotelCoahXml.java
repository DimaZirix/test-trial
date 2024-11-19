package com.pocketm.domain.source.coah.xml;

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
public class HotelCoahXml {

    @JsonProperty("giata_id")
    private int giataId;

    private int iff;

    private String name;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private AddressHotelCoahXml address;

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

    private TextHotelCoahXml texts;

    private USPSHotelCoahXml usps;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> additionalTexts;

    private ImagesHotelCoahXml images;

    private VideosHotelCoahXml videos;

    private AttributesHotelCoahXml attributes;

    private RatingsHotelCoahXml ratings;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> hotelAwards;
}
