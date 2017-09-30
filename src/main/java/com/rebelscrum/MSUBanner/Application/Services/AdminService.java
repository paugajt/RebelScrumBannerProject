package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;


public interface AdminService {
    Iterable<Admin> listAllAdmins();

    Admin getAdminById(Integer id);

    Admin saveAdmin (Admin admin);

    void deleteAdmin (Integer id);
}
