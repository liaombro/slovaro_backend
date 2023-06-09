package com.example.slovaro_backend.service;

import com.example.slovaro_backend.entity.Source;

import java.util.List;

public interface SourceService {

    List<Source> getSources();

    Source getSourceById(Long id);

    Source addSource(Source source);

    void updateSource(Source source);

    void deleteSourceById(Long id);
}
