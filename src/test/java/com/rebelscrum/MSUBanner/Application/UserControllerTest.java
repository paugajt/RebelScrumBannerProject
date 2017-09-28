package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Services.UserService;
import jdk.net.SocketFlow;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static java.util.Collections.singletonList;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserControllerTest.class)

public class UserControllerTest {

    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Before
    public void init() {
        /*MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        */
    }

    @Test
    public void setUserService() throws Exception {
    }

    @Test
    public void list() throws Exception { //List all users
        //Example from http://memorynotfound.com/unit-test-spring-mvc-rest-service-junit-mockito/

        User user1 = new User();
        user1.setFirstName("Testy");
        user1.setLastName("Testerson");
        user1.setUserType("Student");
        user1.setEmail("ttesterson2@msudenver.edu");

        User user2 = new User();
        user2.setFirstName("Arg");
        user2.setLastName("Blargnein");
        user2.setUserType("Student");
        user2.setEmail("ablargnein42@msudenver.edu");

        List<User> users = Arrays.asList(
                user1,
                user2);

        when(userService.listAllUsers()).thenReturn(users);
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].firstName", is("Testy")))
                .andExpect(jsonPath("$[0].lastName", is("Testerson")))
                .andExpect(jsonPath("$[0].userType", is("Student")))
                .andExpect(jsonPath("$[0].email", is("ttesterson2@msudenver.edu")))
                .andExpect(jsonPath("$[1].id", is(2)))
                .andExpect(jsonPath("$[1].firstName", is("Arg")))
                .andExpect(jsonPath("$[1].lastName", is("Blargnein")))
                .andExpect(jsonPath("$[1].userType", is("Student")))
                .andExpect(jsonPath("$[1].email", is("ablargnein42@msudenver.edu")));
        verify(userService, times(1)).listAllUsers();
        verifyNoMoreInteractions(userService);
    }

    @Test
    public void showUser() throws Exception {
        //Mockito.when(showUser().getFirstName("SomeId")).thenReturn("Test user name");

        //Example from https://www.blazemeter.com/blog/spring-boot-rest-api-unit-testing-with-junit
        //User user = new User();
        //user.setFirstName("Testy");
        //user.setLastName("Testerson");
        //user.setEmail("ttesterson1@msudenver.edu");
        //user.setStatus("Student");    //Cannot resolve method setStatus
        //user.setId(1234);             //Why? Or why not?

        //given(userController.showUser(user.getId(), user).willReturn(user);

        //VERSION and USER are not right; figure out what should go there
        //mvc.perform(get(VERSION + USER + user.getId()).andExpect(status().isOk());

    }

    @Test
    public void edit() throws Exception {
        //User user = new User();
        /*
        when(userService.getUser(user.getId())).thenReturn(user);
        doNothing().when(userService).updateUser(user);
        */
    }

    @Test
    public void newUser() throws Exception {
        //Set a new user, user should appear in database
        //User user = new User();
        //user.setFirstName("Testy");
        //user.setLastName("Testerson");
        //user.setEmail("ttesterson@msudenver.edu");
        //user.setStatus? Can't find the method for set status
    }

    @Test
    public void saveUser() throws Exception {

    }

    @Test
    public void delete() throws Exception {
    }

}