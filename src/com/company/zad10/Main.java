package com.company.zad10;

public class Main {


    public static int method() {
        int[] array = new int[10];
        array[9] = 8;
        array[1] = 2;

        try {
            System.out.println(array[1]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Poza indeksem");
        } finally {
            System.out.println("Koniec");
        }
        return 0;
    }

    public static void main(String[] args) {
        method();
    }
}
