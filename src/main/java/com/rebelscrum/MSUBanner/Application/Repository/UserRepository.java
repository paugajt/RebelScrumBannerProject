package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface UserRepository extends CrudRepository<User, Integer> {


}

