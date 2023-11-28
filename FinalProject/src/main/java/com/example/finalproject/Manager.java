package com.example.finalproject;

/**
 * This class represents the manager user which extends off of the person class
 */
public class Manager extends Person{
    /**
     * constructs a new manager object with fields inherited from class person
     * @param pName
     * @param pEmail
     * @param pPassword
     */
    public Manager(String pName, String pEmail, String pPassword) {
        super(pName, pEmail, pPassword);
    }
}
