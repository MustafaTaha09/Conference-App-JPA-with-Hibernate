package com.example.conferenceusingjpa.model;

import javax.persistence.*;

@Entity
//@Table(name = "USER")
// this is just to give the table a name. this will create a new table called conf_users along with the user table that is makde by the entity.
// go ahead and drop the table from the mysql workbench. WHY this happens tho? he said the answer but i didnt understand.

public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="first_name")
    //we can use the column annotation to add info to our column in the DB. u can not include it and it will use the defaults.
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


}
