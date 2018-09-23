package com.company.zad7;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle{


    @Override
    public void stop() {
        System.out.println("Samochód stoi");
    }

    @Override
    public void run() {
        System.out.println("Samochód jedzie");
    }

    public static void main(String[] args) {

        // 1. Interfejs może być używany jako typ
        // Czyli Samochód i Rower mogą być traktowane jako Pojazd
        // Czyli jestem w stanie stworzyć listę pojazdów do których dodaję i samochód i rower
        // Dlatego że te dwie klasy implementują pojazd
        // Interfejs rozwiązuje ten sam problem jak dziedziczenie
        // czyli tak samo jakbyśmy zamiast implements użyli extends to tak samo moglibyśmy rozwiązać ten problem
        // czyli mieć listę pojazdów
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bike());
        vehicleList.add(new Car());
        vehicleList.add(new Bike());

        for (Vehicle vehicle : vehicleList){
            vehicle.run();
        }
    }
}
