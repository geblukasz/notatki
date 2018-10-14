package com.company.zad7.drugiPrzyklad;

import com.company.zad7.drugiPrzyklad.Provider;

public class Cache implements Provider {

    @Override
    public void save() {
        System.out.println("Zapis do cache");
    }
}
