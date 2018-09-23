package com.company;

public class Silnia {


    public static void main(String[] args) {

        Silnia silnia = new Silnia();
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i + "---");
            System.out.println(silnia.policz(599999));
//        }
    }


    /*
     * 1 - 1
     * 2 - 1+2 = 3
     * 3 - 1+2+3 = 6
     * 4 - 1+2+3+4 = 10
     * 5 - 1+2+3+4+5 = 15
     *
     *
     * */


    private int sumeIteracja(int n) {
        int suma = 0;
        while (n > 0) {
            suma = suma + n;
            n--;
        }
        return suma;
    }


    private int policz(int n) {

        if (n > 0) {
            return n + policz(n - 1);
        } else {
            return 0;
        }
        /*
        * 5 + 4 + 3 + 2 + 1 + 0
        * */
//        return n > 0 ? policz(n-1) : 0;
    }
}


//        return n <= 1 ? 1 : n + policz(n - 1);



