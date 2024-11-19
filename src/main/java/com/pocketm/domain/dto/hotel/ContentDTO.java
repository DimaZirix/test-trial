package com.pocketm.domain.dto.hotel;

import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentDTO {

    private Integer fileId;

    private HotelDTO hotel;

}
