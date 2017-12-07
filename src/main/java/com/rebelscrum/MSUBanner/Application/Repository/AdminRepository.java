package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 * repository to communicate with the database.
 */
public interface AdminRepository extends CrudRepository<Admin, Integer> {


}

