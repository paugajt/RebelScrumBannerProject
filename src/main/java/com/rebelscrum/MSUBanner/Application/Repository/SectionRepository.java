package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Section;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface SectionRepository extends CrudRepository<Section, Integer> {
        }
