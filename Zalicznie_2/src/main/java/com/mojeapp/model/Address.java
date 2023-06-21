package com.mojeapp.model;

public class Address {
    private String street;
    private String city;
    private String zipCode;

    /**
     * Tworzy nową instancję adresu.
     *
     * @param street   nazwa ulicy
     * @param city     nazwa miasta
     * @param zipCode  kod pocztowy
     */
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    /**
     * Zwraca nazwę ulicy.
     *
     * @return nazwa ulicy
     */
    public String getStreet() {
        return street;
    }

    /**
     * Zwraca nazwę miasta.
     *
     * @return nazwa miasta
     */
    public String getCity() {
        return city;
    }
    /**
     * Zwraca kod pocztowy.
     *
     * @return kod pocztowy
     */
    public String getZipCode() {
        return zipCode;
    }
}
