package com.company.zad21;

public interface Savable {

    default void saveToDatabase() {
        System.out.println("Zapisuje do bazy danych");
    }
}
