package com.example.finalproject;

public class Person {
    private String aName;
    private String aEmail;
    private String pPassword;

    public Person(String pName, String pEmail, String pPassword) {
        this.setName(pName);
        this.setEmail(pEmail);
        this.setPassword(pPassword);
    }

    public String getName() {
        return aName;
    }

    public void setName(String pName) {
        if (pName == null || pName.isEmpty())
            throw new IllegalArgumentException("A persons name cannot be empty!");
        this.aName = pName;
    }

    public String getEmail() {
        return aEmail;
    }

    public void setEmail(String pEmail) {
        this.aEmail = pEmail;
    }

    public String getPassword() {
        return pPassword;
    }

    public void setPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    public boolean checkCredentials(String pEmail, String pPassword){
        return this.aEmail.equals(pEmail) && this.pPassword.equals(pPassword);
    }
}
