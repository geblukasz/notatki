package com.company.zad22;
/*
* jesli nie zrobimy tostring to mamy
* standardową implementację z hashcodem
*
* */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main);

    }

/*
* Dziedziczymy po Object także dobra praktyka to @Override
*
*/
    @Override
    public String toString() {
        return "Person";
    }
}
