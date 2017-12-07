package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Section;
import com.rebelscrum.MSUBanner.Application.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * implementation to communicate with the database.
 */
@Service
public class SectionServiceImpl implements SectionService {
    /**
     * repository to communicate with the database.
     */
    private SectionRepository sectionRepository;

    /**
     * setter used for testing purposes.
     * @param sectionRepository
     */
    @Autowired
    public void setSectionRepository(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository; }

    /**
     * list all the sections in the database.
     * @return list of sections
     */
    @Override
    public Iterable<Section> listAllSections() {
        return sectionRepository.findAll(); }

    /**
     * find section in database.
     * @param id of section
     * @return section
     */
    @Override
    public Section getSectionById(Integer id) {
        return sectionRepository.findOne(id); }

    /**
     * save section to database.
     * @param section
     * @return section
     */
    @Override
    public Section saveSection(Section section) {
        return sectionRepository.save(section); }

    /**
     * delete section from database.
     * @param id of section
     */
    @Override
    public void deleteSection(Integer id) {
        sectionRepository.delete(id); }
}
