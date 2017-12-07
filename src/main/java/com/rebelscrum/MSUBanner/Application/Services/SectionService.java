package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Section;

/**
 * interface to interact with the database.
 */
public interface SectionService {
    /**
     * list all the sections from the database.
     * @return all sections
     */
    Iterable<Section> listAllSections();

    /**
     * find the section in the database.
     * @param id of section
     * @return the section
     */
    Section getSectionById(Integer id);

    /**
     * save the section to the database.
     * @param section
     * @return section
     */
    Section saveSection(Section section);

    /**
     * delete the section in the database.
     * @param id of section
     */
    void deleteSection(Integer id);
}
