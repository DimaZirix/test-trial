package com.pocketm.domain.xml.coah;

import com.pocketm.domain.json.coah.ContentCoahJson;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RootCoahNode {

    private ContentCoahJson content;

}
