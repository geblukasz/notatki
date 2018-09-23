package com.company.zad13;


/*
* Adnotacje służą do przechowywania metadanych
* przekazują dane o kodzie źródłowym
* mogą być nad klasą, metodą, zmienną
*
* Jest duza moda na używanie adnotacji
* Kod javovy który używa takiego mechanizmu jak refleksja który bada właściwości danej klasy
* może robić tzw magię - np wygenerować klasę albo metodę
* np. @SpringBootApplication
*
*
* */

import java.lang.annotation.Annotation;

@LukaszAnnotation(to="db")
public class Main {

    public static void main(String[] args) {


    Class aClass = Main.class;
    Annotation[] annotations = aClass.getAnnotations();

    for(Annotation annotation : annotations) {
        LukaszAnnotation lukaszAnnotation = (LukaszAnnotation) annotation;
        System.out.println("Argument: " + lukaszAnnotation.to());
        String file = lukaszAnnotation.to();
    }

    }

}
