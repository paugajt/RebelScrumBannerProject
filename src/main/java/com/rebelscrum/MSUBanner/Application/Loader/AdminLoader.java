package com.rebelscrum.MSUBanner.Application.Loader;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;
import com.rebelscrum.MSUBanner.Application.Repository.AdminRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class AdminLoader implements ApplicationListener<ContextRefreshedEvent> {
    private AdminRepository adminRepository;

    private Logger log = Logger.getLogger(AdminLoader.class);

    @Autowired
    public void setAdminRepository(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Admin admin = new Admin();
        admin.setFirstName("Sang");
        admin.setLastName("Nguyen");
        admin.setEmail("snguye39@msudenver.edu");
        admin.setAdminType("Administrator");
        admin.setDepartment("Computer Science");
        adminRepository.save(admin);

        log.info("Saved Administrator -id: " + admin.getId());


    }
}
