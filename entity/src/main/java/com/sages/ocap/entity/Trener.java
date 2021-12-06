package com.sages.ocap.entity;

import java.util.Objects;

public class Trener {
    private final String login;
    private final String name;

    public Trener(String login, String name) {
        this.login = login;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Trener{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trener trener = (Trener) o;
        return login.equals(trener.login) && Objects.equals(name, trener.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name);
    }
}
