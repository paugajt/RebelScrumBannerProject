package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.Entity;

/**Admin is an extension of User.
 */
@Entity
public class Admin extends User {
    /** department string.
     */
    private String department;

    /** password string.
     */
    private String password;

    /**correctly executed method.
     *@return FirstName
     */
    public String getFirstName() {
        return super.getFirstName();
    }

    /**correctly executed method.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    /**correctly executed method.
     *@return lastName
     */
    public String getLastName() {
        return super.getLastName();
    }

    /**correctly executed method.
     *@paramlastName
     */
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    /**correctly executed method.
     * @return email
     */
    public  String getEmail() {
        return super.getEmail();
    }
    /**correctly executed method.
     *@param email
     */
    public void setEmail(String email) {
        super.setEmail(email); }
    /**correctly executed method.
     * @return id
     */
    public Integer getId() {
        return super.getId();
    }
    /**correctly executed method.
     */
    public void setUserType() {
        super.setUserType("Administrator"); }

    /**correctly executed method.
     *@return UserType
     */
    public String getUserType() {
        return super.getUserType();
    }

    /**correctly executed method.
     *@return department
     */
    public String getDepartment() {
        return department;
    }

    /**correctly executed method.
     *@param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**correctly executed method.
     *@return password
     */
    public String getPassword() {
        return password;
    }

    /**correctly executed method.
     *@param password
     */
    public void setPassword(String password) {
        this.password = password; }

}

