package com.pocketm.domain.dto;

import com.pocketm.domain.source.CoahSource;
import com.pocketm.domain.source.GiataSource;
import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
public class SourceContentDTO {

    private final GiataSource giata;

    private final CoahSource coah;
}
