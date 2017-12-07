package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;


@Entity
public class User {
    @Id

    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String userType;
    private String username;
    private String password;
    private String passwordConfirm;

   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {

       if (email.contains("@")){
           this.email = email;
       }
       else
           this.email = null;

   }

   public void setUsername(String username){ this.username = username;}

   public String getUsername() {return username;}



   public Integer getId(){
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public void setUserType(String userType) {
       this.userType = userType;
   }

   public String getUserType() {
       return userType;
   }

   public String getPassword() {return password;}


   public void setPassword(String password) {this.password = password;}

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
    }


