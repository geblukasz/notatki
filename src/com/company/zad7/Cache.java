package com.company.zad7;

public class Cache implements Provider {

    @Override
    public void save() {
        System.out.println("Zapis do cache");
    }
}
