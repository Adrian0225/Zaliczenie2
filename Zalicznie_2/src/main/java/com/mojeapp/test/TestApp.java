package com.mojeapp.test;

import com.google.gson.Gson;
import com.mojeapp.model.User;
import com.mojeapp.model.Address;

import com.mojeapp.service.UserService;
/**
 * Klasa UserService dostarcza metody do obsługi informacji o użytkownikach.
 */
public class TestApp {
    /**
     * wyswietla informacje o uzytkowniku
     * @param args
     */
    public static void main(String[] args) {

        Address address = new Address("Main St", "City", "12345");

        User user = new User("John Doe", 25, "1234567890", address, "123-456-7890");

        Gson gson = new Gson();

        String AddressJson = gson.toJson(address);

        String User = gson.toJson(user);

        UserService userService = new UserService();

        userService.displayUserInfo(user);
    }
}