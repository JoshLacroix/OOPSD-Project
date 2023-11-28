package com.example.finalproject;

/**
 * This class represents the client user which extends off of the person class
 */
public class Client extends Person{
    /**
     * constructs a new client object with fields inherited from class person
     * @param pName
     * @param pEmail
     * @param pPassword
     */
    public Client(String pName, String pEmail, String pPassword) {
        super(pName, pEmail, pPassword);
    }
}
