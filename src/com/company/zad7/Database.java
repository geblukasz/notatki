package com.company.zad7;

public class Database implements Provider{


    @Override
    public void save() {
        System.out.println("Zapis do bazy danych");
    }
}
