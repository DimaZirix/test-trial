package com.pocketm.service.converter;

import com.pocketm.domain.dto.hotel.ContentDTO;

import java.nio.file.Path;

public interface FileConverterService {

   ContentDTO convert(int id, Path path);

}
