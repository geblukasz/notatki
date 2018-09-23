package com.company.zad21;

/*
* Zamiast dziedziczy po User
* można zrobic private User user;
* czyli Admin zawiera użytkownika w sobie
*
*
* Często spotykane w bazach danych gdzie dziedziczenie
* nie jest takie proste
*
* np Admin zawiera id jakiegoś użytkownika
*
*
*
* */
public class Admin /*extends User*/ implements Savable{

    public Admin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    private User user;
    private String[] roles;
}
