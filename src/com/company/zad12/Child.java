package com.company.zad12;

public class Child extends Mother/*, Father*/ {

    /*
    * Wielodziedziczenie prowadzi do wielu problemów
    * Jeśli dziecko dziedziczy po ojcu i po matce:
    * ojciec i matka ma imię, w takim razie ktore
    * które pole powinno być brane? Z Mother czy z Father?
    * To samo tyczy się metod.
    *
    * W jakiś tam sposób problem wielodziedziczenie rozwiązują interfejsy
    * Ale pamiętajmy że interfejsy są ściśle związane z metodami
    * Dlatego interfejs nie zastąpi nam w pełni wielodziedziczenia
    *
    * */



    public static void main(String[] args) {
        Mother child = new Child();
        System.out.println(child.getName());
    }
}
