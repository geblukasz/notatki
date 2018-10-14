package com.company.zad4Polimorfizm;

public class Patient extends Person {

    public String pesel;

    public static void main(String[] args) {
        Patient patient = new Patient();
        Person patient2 = new Patient();

        patient.imie = "Nowak";
        patient.nazwisko = "Nowak";
        patient.pesel = "123123";

        patient2.imie = "Adan";
        patient2.nazwisko = "Kowalski";

        Patient myPatient = (Patient) patient2;
        myPatient.pesel = "823723";

        System.out.println(myPatient.pesel);


    }

}
