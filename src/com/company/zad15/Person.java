package com.company.zad15;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* equals() służy do porównywania dwóch obiektow
*
*
* */
public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Adam","Kowalski",15));
        people.add(new Person("Piotr","Nowak",18));

        System.out.println(people);
    }
}
