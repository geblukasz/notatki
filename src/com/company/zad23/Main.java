package com.company.zad23;

public class Main {

    public static void main(String[] args) {

        for (long i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++){
            Long l = (i << 32) + i;
            System.out.print(l.hashCode() + " ");
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}
