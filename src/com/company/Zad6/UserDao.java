package com.company.Zad6;

/*
 *
 * DZIEDZICZENIE:
 * Klasa może implementować wiele interfejsów
 * Możemy dziedziczyć tylko po jednej klasie
 *
 * WIDOCZNOŚĆ METOD:
 * Klasa Abstrakcyjna: prywatne, protected, public
 * Interfejsy:
 *
 * Od Javy 9 w Interfejsie możliwość także metod prywatnych
 * (i statycznych i niestatycznych)
 *
 * Od Javy 8 także metody statyczne
 *
 *
 * STAŁE:
 * Interfejsy i Klasy mogą zawierać
 *
 * Atrybuty:
 * mogą zawierać tylko klasy
 * private String username;
 *
 *
 * */

import java.util.List;

public interface UserDao {

//    Atrybuty
//    String username;

    //od Javy 8 także możliwość statycznych metod
    static int getAll() {
        return 5;
    }

    // od Javy 8 metody z implementacją (DEFAULT)
    // czyli jeśli klada implementująca nie nadpisze tej metody to będzie implementacja z interfejsu
    default void displayAll(List<User> userList) {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    //TYPY ZAGNIEŻDŻONE OD JAVY 7 JUZ NIE TYLKO W KLASACH ABSTRAKCYJNYCH
    // ALE ROWNIEŻ W INTERFEJSACH
    public enum Status {
        ON, OFF;
    }

    Status getStatus();


}
