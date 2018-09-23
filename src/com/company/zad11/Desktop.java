package com.company.zad11;

public interface Desktop {

    //jest default dlatego możemy miec implementację od razu w interfejsie
    default void save() {
        System.out.println("Desktop implementation");
    }
}
