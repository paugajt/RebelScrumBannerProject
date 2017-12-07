package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;

/**
 * Interface that interacts with the database.
 */

public interface AdminService {
    /**
     * Creates a list of all Admins that are currently in the
     * database.
     * @return admins
     */
    Iterable<Admin> listAllAdmins();

    /**
     * Finds a admins that resides in the database.
     * @param id - id number for the admins we are looking for.
     * @return admin
     */
    Admin getAdminById(Integer id);

    /**
     * Add admin into database.
     * @param admin - save the id
     * @return admin
     */
    Admin saveAdmin(Admin admin);

    /**
     * Delete admin from the database.
     * @param id - remove the id
     */
    void deleteAdmin(Integer id);
}
