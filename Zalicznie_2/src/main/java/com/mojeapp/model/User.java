package com.mojeapp.model;

public class User {
    private String name;
    private int age;
    private String pesel;
    private Address address;
    private String phoneNumber;

    /**
     * Tworzy nową instancję użytkownika.
     *
     * @param name         imię i nazwisko użytkownika
     * @param age          wiek użytkownika
     * @param pesel        numer PESEL użytkownika
     * @param address      adres zamieszkania użytkownika
     * @param phoneNumber  numer telefonu użytkownika
     */
    public User(String name, int age, String pesel, Address address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public User() {

    }


    /**
     * Zwraca adres zamieszkania użytkownika.
     *
     * @return adres zamieszkania
     */
    public Address getAddress() {
        return address;
    }
    /**
     * Zwraca numer telefonu użytkownika.
     *
     * @return numer telefonu
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Zwraca numer PESEL użytkownika.
     *
     * @return numer PESEL
     */

    public String getPesel() {
        return pesel;
    }
    /**
     * Zwraca wiek użytkownika.
     *
     * @return wiek
     */


    public int getAge() {
        return age;
    }

    /**
     * Zwraca imię i nazwisko użytkownika.
     *
     * @return imię i nazwisko
     */

    public String getName() {
        return name;
    }
}