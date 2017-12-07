package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;
import com.rebelscrum.MSUBanner.Application.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation to communicate to the database
 * H2 Implementation.
 */
@Service
public class AdminServiceImpl implements AdminService {

    /**
     * Repository to have us be able to communicate with the database.
     */
    private AdminRepository adminRepository;

    /**
     * Setter for admin to use for testing.
     * @param adminRepository
     */
    @Autowired
    public void setAdminRepository(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    /**
     * Creates a list of all the buildings and list them.
     * @return all the building in the database
     */
    @Override
    public Iterable<Admin> listAllAdmins() {
        return adminRepository.findAll();
    }

    /**
     * find the admin by id.
     * @param id - id number for the admins we are looking for.
     * @return
     */
    @Override
    public Admin getAdminById(Integer id) {
        return adminRepository.findOne(id);
    }

    /**
     * Save the admin to the database.
     * @param admin - save the id
     * @return the saved admin
     */
    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    /**
     * Delete a user from the database using id.
     * @param id - remove the id
     */
    @Override
    public void deleteAdmin(Integer id) {
        adminRepository.delete(id);
    }
}
