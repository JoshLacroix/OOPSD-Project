package com.example.finalproject;

import java.util.LinkedList;
import java.util.List;

/**
 * collection of people with their information stored in a list
 */
public class PersonList {
    /**
     * list of people
     */
    private final List<Person> myPersons = new LinkedList<Person>();

    /**
     * Constructs a new list with default samples
     */
    public PersonList() {
        this.myPersons.add(new Manager("Peter", "peter@gmail.com", "123456"));
        this.myPersons.add(new Client("Paul", "paul@gmail.com", "123456"));
        this.myPersons.add(new Client("Jane", "JaneDoe@outlook.com", "blindspot"));
    }

    /**
     * Add a new person to the list
     * @param pClient
     * @return
     */
    public boolean addPerson(Client pClient) {
        return this.myPersons.add(pClient);
    }

    /**
     * Ensures that the input during log in is a valid credential
     * @param pEmail
     * @param pPassword
     * @return
     */
    public Person checkCredentials(String pEmail, String pPassword) {
        for (Person myPerson : myPersons) {
            if (myPerson.checkCredentials(pEmail, pPassword)) {
                return myPerson;
            }
        }
        return null;
    }
}
