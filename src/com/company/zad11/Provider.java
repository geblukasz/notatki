package com.company.zad11;

public interface Provider {

    //jest default dlatego możemy miec implementację od razu w interfejsie
    default void save() {
        System.out.println("Baza");
    }
}
