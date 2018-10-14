package com.company.zad25Static;

public class ClubMember {

    private String firstname;
    private String lastname;
    private int memberID;
    // do sledzenia numeru uzytkownika
    // slowko static gwarantuje, że dane pole (albo metoda) bedzie wystepowala
    // tylko w jednym egzemplarzu dla klasy ClubMember
    private static int ID;
    /*przy tworzeniu nowej instancji klasy clubMember nie bedziemy tworzyc nowego pola int ID - tak jak to się dzieje w przypadku innych pol
    * w tym przypadku bedie tylko jedno pole ID ktore bedzie WSPOLDZIELONE przez wszystkie instancje tej klasy
    *
    *
    *
    * */

    public ClubMember(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.memberID = ID++;
        System.out.println(firstname + " " + lastname + " " + memberID);
    }

    // tworzymy metode ktora wystepuje tylko w jednym egzemplarzu dla wszystich klas
    // czyli jesli stworzylibysmy metode Main ktora bylaby statyczna to bylby konflikt
    public static void main(String[] args) {
        ClubMember clubMember = new ClubMember("Zdzislaw", "Pyton");
        ClubMember clubMember1 = new ClubMember("Brad", "Pit");
        ClubMember clubMember2 = new ClubMember("A", "B");
        //Do metod statycznych możemy się odwoływać bezpośrednio
        ClubMember.getMeSomeInt();
    }

    /*Pola i metody statyczne występują tylko w jednym egzemplarzu
    *
    *
    * */

    public static int getMeSomeInt(){
        //tutaj nie mozemy odwolywac się do pól które nie są statyczne
//        this.firstname = "";
        return 0;
    }

    /*
    PODSUMOWANIE:
    Pola i metody statyczne sa przywiazane do danej klasy
    ale wystepuja tylko w jednym egzemplarzu
    przy tworzeniu nowej instancji danej klasy te pola sa wspoldzielone

     */




}
