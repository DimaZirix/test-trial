package com.pocketm.mapper;

import com.pocketm.domain.dto.hotel.AttributesHotelDTO;
import com.pocketm.domain.source.coah.json.AttributesHotelCoahJson;
import com.pocketm.domain.source.coah.xml.AttributesHotelCoahXml;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class AttributesCoahMapper {

    public AttributesHotelDTO toDTO(AttributesHotelCoahXml source) {
        return AttributesHotelDTO.builder()
            .properties(toDTO(source.getProperties()))
            .category(toDTOXml(source.getCategory()))
            .build();
    }

    public AttributesHotelDTO toDTO(AttributesHotelCoahJson source) {
        return AttributesHotelDTO.builder()
            .properties(toDTO(source.getProperties()))
            .category(toDTOJson(source.getCategory()))
            .build();
    }

    public AttributesHotelDTO.AttributesNodeProperties toDTO(AttributesHotelCoahXml.AttributesNodeProperties source) {
        return AttributesHotelDTO.AttributesNodeProperties.builder()
            .source(source.getSource())
            .build();
    }

    public AttributesHotelDTO.AttributesNodeProperties toDTO(AttributesHotelCoahJson.AttributesNodeProperties source) {
        return AttributesHotelDTO.AttributesNodeProperties.builder()
            .source(source.getSource())
            .build();
    }


    public List<AttributesHotelDTO.Category> toDTOXml(List<AttributesHotelCoahXml.Category> source) {
        return source.stream()
            .map(this::toDTO)
            .toList();
    }

    public List<AttributesHotelDTO.Category> toDTOJson(List<AttributesHotelCoahJson.Category> source) {
        return source.stream()
            .map(this::toDTO)
            .toList();
    }

    public AttributesHotelDTO.Category toDTO(AttributesHotelCoahXml.Category source) {
        return AttributesHotelDTO.Category.builder()
            .properties(toDTO(source.getProperties()))
            .attribute(source.getAttribute())
            .build();
    }

    public AttributesHotelDTO.Category toDTO(AttributesHotelCoahJson.Category source) {
        return AttributesHotelDTO.Category.builder()
            .properties(toDTO(source.getProperties()))
            .attribute(source.getAttribute())
            .build();
    }

    public AttributesHotelDTO.CategoryNodeProperties toDTO(AttributesHotelCoahXml.CategoryNodeProperties source) {
        return AttributesHotelDTO.CategoryNodeProperties.builder()
            .name(source.getName())
            .build();
    }

    public AttributesHotelDTO.CategoryNodeProperties toDTO(AttributesHotelCoahJson.CategoryNodeProperties source) {
        return AttributesHotelDTO.CategoryNodeProperties.builder()
            .name(source.getName())
            .build();
    }
}
