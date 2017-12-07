package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * implementation to communicate with the database.
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * repository to communicate with the database.
     */
    private UserRepository userRepository;

    /**
     * setter used for testing purposes.
     * @param userRepository
     */
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * list all the users.
     * @return list of users
     */
    @Override
    public Iterable<User> listAllUsers() {
        return userRepository.findAll();
    }

    /**
     * find the user by id.
     * @param id
     * @return user
     */
    @Override
    public User getUserById(Integer id) {
        return userRepository.findOne(id);
    }

    /**
     * save the user.
     * @param user
     * @return user
     */
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * delete user from database.
     * @param id
     */
    @Override
    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }
}
