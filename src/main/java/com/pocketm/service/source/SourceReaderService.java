package com.pocketm.service.source;

import com.pocketm.domain.dto.SourceContentDTO;
import com.pocketm.domain.source.Source;

import java.nio.file.Path;

public interface SourceReaderService {
    SourceContentDTO read(int id, Path path);
}
