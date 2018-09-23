package com.company.zad13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/*
*
*
*
*
* */
@Retention(RetentionPolicy.RUNTIME)
public @interface LukaszAnnotation {
    // można porównać tą metodę do zmiennej
    // dzięki temu jak będziemy wstawiać adnotację,
    // będziemy mogli "to" i wartość, a nasz program będzie mógł to sobie odczytać

    String to();
}
