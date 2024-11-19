package com.pocketm.domain.source.coah.xml;

import com.pocketm.domain.source.Source;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentCoahXml implements Source {

    private HotelCoahXml hotel;

}
