package com.company.zad7.drugiPrzyklad;

import com.company.zad7.drugiPrzyklad.Provider;

public class Database implements Provider {


    @Override
    public void save() {
        System.out.println("Zapis do bazy danych");
    }
}
