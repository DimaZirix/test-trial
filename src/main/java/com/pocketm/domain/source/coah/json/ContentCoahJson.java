package com.pocketm.domain.source.coah.json;

import com.pocketm.domain.source.CoahSource;
import com.pocketm.domain.source.Source;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentCoahJson implements CoahSource {

    private HotelCoahJson hotel;

}
