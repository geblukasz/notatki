package com.company.Zad6RoznicaKlAbstInterface;

import com.company.zad5KlasaAbstrakcyjna.RegularUser;

import java.util.ArrayList;
import java.util.List;

// DZIEDZICZYMY PO KLASIE PONIEWAZ POTRZEBUJEMY POL ORAZ METOD
public class Admin extends User {

    //MOŻEMY DZIDZICZYĆ TYLKO PO JEDNEJ KLASIE (ROWNIEZ ABSTRAKCYJNEJ)
    //MOŻEMY IMPLEMENTOWAĆ WIELE INTERFEJSÓW

    //PRZYKLAD AGREGACJI (ASOCJACJI)
    private User user;

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
