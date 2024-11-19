package com.pocketm.domain.dto.hotel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.pocketm.domain.dto.hotel.giata.GiataHotelDTO;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {

    @JsonProperty("giata_id")
    private int giataId;

    private int iff;

    private String name;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private AddressHotelDTO address;

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

    private TextHotelDTO texts;

    private USPSHotelDTO usps;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> additionalTexts;

    private ImagesHotelDTO images;

    private VideosHotelDTO videos;

    private AttributesHotelDTO attributes;

    private RatingsHotelDTO ratings;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Object> hotelAwards;

    private GiataHotelDTO giata;
}
