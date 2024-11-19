package com.pocketm.domain.source.coah.xml;

import com.pocketm.domain.source.CoahSource;
import com.pocketm.domain.source.Source;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentCoahXml implements CoahSource {

    private HotelCoahXml hotel;

}
