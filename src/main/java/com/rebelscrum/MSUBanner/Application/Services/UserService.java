package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.User;

/**
 * interface to communicate with the database
 */

public interface UserService {
    /**
     * list all users
     * @return
     */
    Iterable<User> listAllUsers();

    /**
     * find user
     * @param id
     * @return user
     */
    User getUserById(Integer id);

    /**
     * save user
     * @param user
     * @return
     */
    User saveUser(User user);

    /**
     * delete user
     * @param id
     */
    void deleteUser(Integer id);
}
