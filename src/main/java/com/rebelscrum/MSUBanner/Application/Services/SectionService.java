package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Section;

public interface SectionService {
    Iterable<Section> listAllSections();

    Section getSectionById(Integer id);

    Section saveSection(Section section);

    void deleteSection(Integer id);
}
