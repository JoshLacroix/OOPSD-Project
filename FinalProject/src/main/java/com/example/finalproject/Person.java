package com.example.finalproject;

/**
 * This class represents an individual user with a name, email, and password
 */
public class Person {
    /**
     * Name of the person
     */
    private String aName;
    /**
     * Email of the person
     */
    private String aEmail;
    /**
     * Password of the person
     */
    private String pPassword;


    /**
     * Constructs a person object with the fields
     * @param pName
     * @param pEmail
     * @param pPassword
     */
    public Person(String pName, String pEmail, String pPassword) {
        this.setName(pName);
        this.setEmail(pEmail);
        this.setPassword(pPassword);
    }

    /**
     * get the name of person
     * @return
     */
    public String getName() {
        return aName;
    }

    /**
     * set the name of person
     * @param pName
     */
    public void setName(String pName) {
        if (pName == null || pName.isEmpty())
            throw new IllegalArgumentException("A persons name cannot be empty!");
        this.aName = pName;
    }

    /**
     * get the email of person
     * @return
     */
    public String getEmail() {
        return aEmail;
    }

    /**
     * set the email of person
     * @param pEmail
     */
    public void setEmail(String pEmail) {
        this.aEmail = pEmail;
    }

    /**
     * get the password of person
     * @return
     */
    public String getPassword() {
        return pPassword;
    }

    /**
     * set the password of person
     * @param pPassword
     */
    public void setPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    /**
     * Checks if the provided email and password are stored credentials
     * @param pEmail
     * @param pPassword
     * @return
     */
    public boolean checkCredentials(String pEmail, String pPassword){
        return this.aEmail.equals(pEmail) && this.pPassword.equals(pPassword);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Cleint name: " + this.getName() + " email(" + this.getEmail() + ")";
    }
}
