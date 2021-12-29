package com.example.dbapp.model;

public class Contacts {
    private int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private  String contactNumber;

    public Contacts(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public Contacts( String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public Contacts() {

    }




}
