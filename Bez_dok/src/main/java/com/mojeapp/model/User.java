package com.mojeapp.model;

public class User {
    private String name;
    private int age;
    private String pesel;
    private Address address;
    private String phoneNumber;


    public User(String name, int age, String pesel, Address address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public User() {

    }



    public Address getAddress() {
        return address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getPesel() {
        return pesel;
    }



    public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }
}