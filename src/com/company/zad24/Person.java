package com.company.zad24;

import com.company.zad21.Savable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// interfejsma typ generyczny dlatego musimy mu powiedziec co podajemy
public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Adam","Kowalski",21));
        personList.add(new Person("Zdzisław","Python",10));
        personList.add(new Person("Wojciech","Nowak",81));
        personList.add(new Person("Anna","Kowalczuk",35));
        Collections.sort(personList);
        System.out.println(personList);
    }

    /*
    * 0 - jesli obiekty są równe
    *
    * */
    @Override
    public int compareTo(Person o) {
        return Integer.compare(getAge(),o.getAge());
//        return -Integer.compare(getAge(),o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
