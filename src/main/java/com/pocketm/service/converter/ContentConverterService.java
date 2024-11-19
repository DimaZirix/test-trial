package com.pocketm.service.converter;

import com.pocketm.domain.dto.SourceContentDTO;
import com.pocketm.domain.dto.hotel.ContentDTO;

import java.nio.file.Path;

public interface ContentConverterService {

    ContentDTO convert(int id, SourceContentDTO source);
}
