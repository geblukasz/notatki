package com.company.zad7.drugiPrzyklad;

public class Person {

    private Provider provider;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void save() {
        provider.save();
    }

    public static void main(String[] args) {
        /*
        * Zastosowano polimorfizm,
        * czyli baza danych może być traktowana jako typ interfejsowy
        * czyli tutaj Provider
        *
        *
        * */
        Person person = new Person();
        person.setProvider(new Database());
        person.save();
        person.setProvider(new Cache());
        person.save();
    }
}
