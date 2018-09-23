package com.company.zad14;

/*
* == porownuje referencje obiektów (ich miejsce w pamięci)
* equals() porównuje ich wartości
*
* */
public class Main {

    public static void main(String[] args) {

        String a = new String("Lukasz");
        String b = "Lukasz";
        System.out.println(a == b); // false bo wskazują na różne miejsca w pamięci
        System.out.println(a.equals(b)); // true ponieważ wartość jest taka sama

        /*
        * W tym momencie Java stosuje optymalizację "String Pool"
        * czyli taką optymalizację żeby nie tworzyć na nowo miejsca w pamięci
        * W tym momencie "true" ponieważ już była taka wartość w String Poolu więc referencje również trafiły ww to samo miejsce
        *
        * */
        String c = "Lukasz";
        System.out.println(b == c);

    }
}
