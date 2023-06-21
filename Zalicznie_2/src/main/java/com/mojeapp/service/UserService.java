package com.mojeapp.service;

import com.google.gson.Gson;
import com.mojeapp.model.User;

/**
 * Klasa UserService dostarcza metody do obsługi informacji o użytkownikach.
 */
public class UserService {

    public void displayUserInfo(User user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("PESEL: " + user.getPesel());
        System.out.println("Address: " + user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", " + user.getAddress().getZipCode());
        System.out.println("Phone Number: " + user.getPhoneNumber());
    }
}