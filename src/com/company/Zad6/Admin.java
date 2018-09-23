package com.company.Zad6;

import com.company.zad5.RegularUser;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    //MOŻEMY DZIDZICZYĆ TYLKO PO JEDNEJ KLASIE
    //MOŻEMY IMPLEMENTOWAĆ WIELE INTERFEJSÓW


    //MOŻEMY JEDNAK ZAMIAST DZIEDZICZENIA ZAWIERAĆ INNE KLASY
    private List<RegularUser> users = new ArrayList<>();

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    //KLASA ABSTRAKCYJNA MOŻE ZAWIERAĆ POLE NIE BĘDĄCE STAŁYMI
    private String username;
}
