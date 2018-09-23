package com.company.zad9;

/*
* ZMIENNE:
* Jeśli zmienna ajest finalna to nie możemy jej zmienić,
* to jest przykład zabezpieczenia.
*
* KLASY:
* Jeśli klasa jest finalna (ostateczna) to nie możemy podziedziczyć po niej
* Czyli nie możemy jej poszerzyć
*
*
* METODY:
* Worker dziedziczy po Personie
*
* Metoda nie może być nadpisywana w klasach dziedziczących
*
* */
public final class Square {

    private int width;
    private int height;
    private int color;

    static final double PI = 3.14;

    public static void main(String[] args) {
//        Square.PI = 3.15;
    }
}
