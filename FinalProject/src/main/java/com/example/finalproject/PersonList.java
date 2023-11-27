package com.example.finalproject;

import java.util.LinkedList;
import java.util.List;

public class PersonList {
    private final List<Person> myPersons = new LinkedList<Person>();

    public PersonList() {
        this.myPersons.add(new Manager("Peter", "peter@gmail.com", "123456"));
        this.myPersons.add(new Client("Paul", "paul@gmail.com", "123456"));
        this.myPersons.add(new Client("Jane", "JaneDoe@outlook.com", "blindspot"));
    }

    public boolean addPerson(Client pClient) {
        return this.myPersons.add(pClient);
    }

    public Person checkCredentials(String pEmail, String pPassword) {
        for (Person myPerson : myPersons) {
            if (myPerson.checkCredentials(pEmail, pPassword)) {
                return myPerson;
            }
        }
        return null;
    }
}
