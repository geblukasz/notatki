package com.company.zad16;

import java.util.ArrayList;
import java.util.List;
/*
* https://memorynotfound.com/initialization-arraylist-one-line-example/
* */
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>()
        {{ add("Napis");
           add("Napis2");
           add("Napis3");
           add("Napis4");
        }};
        System.out.println(list);
    }
}
