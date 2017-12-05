package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;

/**
 * implementation to create database for users
 */
@Entity
@Table(name="USER")
public class User {
    /**
     * fields to create database table
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USER_ID")
    private Integer id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="USER_TYPE")
    private String userType;

    private String password;


    /**
     * getter for first name
     * @return
     */
   public String getFirstName() {
       return firstName;
   }

    /**
     * setter for first name
     * @param firstName
     */
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

    /**
     * getter for last name
     * @return
     */
   public String getLastName() {
       return lastName;
   }

    /**
     * setter for last name
     * @param lastName
     */
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

    /**
     * getter for email
     * @return
     */
   public String getEmail() {
       return email;
   }

    /**
     * setter for email
     * @param email
     */
   public void setEmail(String email) {

       if (email.contains("@")){
           this.email = email;
       }
       else
           this.email = null;

   }

    /**
     * getter for id
     * @return
     */
   public Integer getId(){
       return id;
   }

    /**
     * setter for id
     * @param id
     */
   public void setId(Integer id) {
       this.id = id;
   }

    /**
     * setter for user type
     * @param userType
     */
   public void setUserType(String userType) {
       this.userType = userType;
   }

    /**
     * getter for user type
     * @return
     */
   public String getUserType() {
       return userType;
   }


    /**
     * setter for password
     * @param password
     */
   public void setPassword(String password) {this.password = password;}

    }

