package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.HotelDTO;
import com.pocketm.domain.source.coah.json.HotelCoahJson;
import com.pocketm.domain.source.coah.xml.HotelCoahXml;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class HotelCoahMapper {

    @Inject
    private AddressCoahMapper addressCoahMapper;

    @Inject
    private TextCoahMapper textCoahMapper;

    @Inject
    private USPSCoahMapper uspsCoahMapper;

    @Inject
    private ImagesCoahMapper imagesCoahMapper;

    @Inject
    private VideosCoahMapper videosCoahMapper;

    @Inject
    private AttributesCoahMapper attributesCoahMapper;

    @Inject
    private RatingsCoahMapper ratingsCoahMapper;

    public HotelDTO toDTO(HotelCoahXml source) {
        return HotelDTO.builder()
            .giataId(source.getGiataId())
            .iff(source.getIff())
            .name(source.getName())
            .latitude(source.getLatitude())
            .longitude(source.getLongitude())
            .address(addressCoahMapper.toDTO(source.getAddress()))
            .phone(source.getPhone())
            .email(source.getEmail())
            .url(source.getUrl())
            .updateTimestamp(source.getUpdateTimestamp())
            .category(source.getCategory())
            .regionCode(source.getRegionCode())
            .countryName(source.getCountryName())
            .texts(textCoahMapper.toDTO(source.getTexts()))
            .usps(uspsCoahMapper.toDTO(source.getUsps()))
            .additionalTexts(source.getAdditionalTexts())
            .images(imagesCoahMapper.toDTO(source.getImages()))
            .videos(videosCoahMapper.toDTO(source.getVideos()))
            .attributes(attributesCoahMapper.toDTO(source.getAttributes()))
            .ratings(ratingsCoahMapper.toDTO(source.getRatings()))
            .hotelAwards(source.getHotelAwards())
            .giata(null)
            .build();
    }

    public HotelDTO toDTO(HotelCoahJson source) {
        return HotelDTO.builder()
            .giataId(source.getGiataId())
            .iff(source.getIff())
            .name(source.getName())
            .latitude(source.getLatitude())
            .longitude(source.getLongitude())
            .address(addressCoahMapper.toDTO(source.getAddress()))
            .phone(source.getPhone())
            .email(source.getEmail())
            .url(source.getUrl())
            .updateTimestamp(source.getUpdateTimestamp())
            .category(source.getCategory())
            .regionCode(source.getRegionCode())
            .countryName(source.getCountryName())
            .texts(textCoahMapper.toDTO(source.getTexts()))
            .usps(uspsCoahMapper.toDTO(source.getUsps()))
            .additionalTexts(source.getAdditionalTexts())
            .images(imagesCoahMapper.toDTO(source.getImages()))
            .videos(videosCoahMapper.toDTO(source.getVideos()))
            .attributes(attributesCoahMapper.toDTO(source.getAttributes()))
            .ratings(ratingsCoahMapper.toDTO(source.getRatings()))
            .hotelAwards(source.getHotelAwards())
            .giata(null)
            .build();
    }
}
