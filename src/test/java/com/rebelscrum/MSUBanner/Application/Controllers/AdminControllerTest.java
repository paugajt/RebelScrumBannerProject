
package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;
import com.rebelscrum.MSUBanner.Application.Repository.AdminRepository;
import com.rebelscrum.MSUBanner.Application.Services.AdminService;
import com.rebelscrum.MSUBanner.Application.Services.AdminServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.junit.Assert.*;


@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest(AdminController.class)
public class AdminControllerTest {

    AdminServiceImpl service = new AdminServiceImpl();

    @Autowired
    private MockMvc mockMvc;


    @Autowired
    private AdminController controller;
    Admin testadmin = new Admin();


    @Test
    @RequestMapping
    public void setAdminService() throws Exception {
        assertNotNull("AdminService is Null",service);

    }

    @Test
    public void list() throws Exception {
    }

    @Test
    public void showAdmin() throws Exception {
    }

    @Test
    public void edit() throws Exception {
    }

    @Test
    public void newAdmin() throws Exception {
    }

    @Test
    public void loginUser() throws Exception {
    }

    @Test
    public void saveAdmin() throws Exception {
    }

    @Test
    public void deleteAdmin() throws Exception {
    }

}
