package com.company.zad5;

import java.util.ArrayList;
import java.util.List;

public class Moderator extends User{
    public Moderator(String userName) {
        super(userName);
    }


    public static void main(String[] args) {

        Moderator moderator = new Moderator("Lukasz");
        Moderator moderator1 = new Moderator("Jan");

        RegularUser regularUser = new RegularUser("Grazyna");
        RegularUser regularUser1 = new RegularUser("Wojciech");

        List<User> users = new ArrayList<>();
        users.add(moderator);
        users.add(moderator1);
        users.add(regularUser);
        users.add(regularUser1);

        users.stream().forEach(System.out::print);

    }

}
