package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;


@Entity
@Table(name="USER")
public class User {
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
       else {

       }
   }

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


   public void setPassword(String password) {this.password = password;}

    }

