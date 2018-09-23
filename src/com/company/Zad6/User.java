package com.company.Zad6;

public abstract class User {

    //MOZE ZAWIERAC POLA, INTERFEJS NIE
    private String username;

    public String getUsername() {
        return username;
    }

    //METODY Z POLAMI
    public void setUsername(String username) {
        this.username = username;
    }

    //MOZLIWA JEST IMPLEMENTACJA METODY OD JAVY 8 TAKZE W INTERFEJSIE
    public void saveToDatabase(){
        System.out.println("");
    }

    //METODY ABSTRAKCYJNE I NIEABSTRAKCYJNE CZYLI Z IMPLEMENTACJĄ
    //W KLASIE ABSTRAKCYJNEJ ZAWSZE MOGLY BYC METODY Z IMPLEMENTACJĄ
    //NATOMIAST W INTERFEJSIE JEST MOZLIWOSC UZYWANIA METOD DEFAULT OD JAVY 8
    /*
    * INTERFEJSY Z KAŻDĄ WERSJĄ JAVY MAJĄ CORAZ WIĘKSZE MOŻLIWOŚCI
    *
    * JEŚLI POTRZEBUJEMY PÓL ORAZ METOD TO WYBIERAMY KLASĘ
    *
    * MINUSY: KLASA  MOŻE DZIEDZICZYĆ TYLKO PO JEDNEJ KLASIE
    *
    *
    *
    *
    * */

}
