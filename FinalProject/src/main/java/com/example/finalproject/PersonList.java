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
    private final List<Person> aPersons = new LinkedList<Person>();
    /**
     * Singleton instance of personlist class
     */
    private static PersonList instance;
    /**
     * Constructs a new list with default samples
     */
    private PersonList() {
        this.aPersons.add(new Manager("Peter", "peter@gmail.com", "123456"));
        this.aPersons.add(new Client("Paul", "paul@gmail.com", "123456"));
        this.aPersons.add(new Client("Jane", "JaneDoe@outlook.com", "blindspot"));
    }
    /**
     * Returns a singleton instance of the TicketList class.
     * If the instance does not exist, a new instance is created.
     * @return The PersonList instance.
     */
    public static PersonList getInstance(){
        if (instance == null) {
            instance = new PersonList();
        }
        return instance;
    }

    /**
     * Ensures that the input during log in is a valid credential
     * @param pEmail
     * @param pPassword
     * @return
     */
    public Person checkCredentials(String pEmail, String pPassword) {
        for (Person myPerson : aPersons) {
            if (myPerson.checkCredentials(pEmail, pPassword)) {
                return myPerson;
            }
        }
        return null;
    }
    /**
     * Retrieves a list of clients with information.
     * @return A LinkedList of strings containing client information.
     */
    public LinkedList<String> getAllClients() {
        LinkedList<String> result = new LinkedList<>();
        for (Person person :  aPersons) {
            if (person instanceof Client){
                result.add(person.toString());
            }
        }
        return result;
    }
}
