package com.company.zad7;

public class Bike implements Vehicle{
    @Override
    public void stop() {
        System.out.println("Rower staje");
    }

    @Override
    public void run() {
        System.out.println("Rower jedzie");
    }
}
