package com.cs6392016.gbergy.cs639firebase;

/**
 * Created by gbergy on 7/11/16.
 */
public class Student {
    private String id, firstname;

    public Student() {
        this.id = "CoolGuyGreg";
        this.firstname = "Greg";
    }

    public  Student(String id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
