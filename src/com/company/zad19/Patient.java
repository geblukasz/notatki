package com.company.zad19;
/*
* Przeciążenie (overloading) - metoda o tej samej nazwie
*
* */
public class Patient extends Person{


    public void work() {
        System.out.println("Ciężka praca");
    }

    //overloading = przeciążenie -> taka sama nazwa ale inne argumenty
    public int work(int times){
        for (int i = 1; i <= times; i++){
            System.out.println("Pracuje");
        }
        return 0;
    }

    public void work (int a, int b){

    }

    /*
    * Overriding (Przesłonięcie) metody
    * czyli jeśli mamy pacjenta który dziedziczy po person
    * to tutaj ją przesłaniamy
    *
    * */
    @Override
    public void go() {
        System.out.println("Pacjent wraca do domu");
    }
}
