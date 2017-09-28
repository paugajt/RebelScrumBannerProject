package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Section;
import com.rebelscrum.MSUBanner.Application.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionServiceImpl implements SectionService{
    private SectionRepository sectionRepository;

    @Autowired
    public void setSectionRepository(SectionRepository sectionRepository) {this.sectionRepository = sectionRepository;}

    @Override
    public Iterable<Section> listAllSections() { return sectionRepository.findAll();}

    @Override
    public Section getSectionById(Integer id) {return sectionRepository.findOne(id);}

    @Override
    public Section saveSection(Section section) { return sectionRepository.save(section);}

    @Override
    public void deleteSection(Integer id) { sectionRepository.delete(id);}
}
