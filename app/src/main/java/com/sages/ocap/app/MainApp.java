package com.sages.ocap.app;

import com.sages.ocap.dao.Dao;

import java.util.ServiceLoader;

public class MainApp {
    public static void main(String[] args) {
        ServiceLoader<Dao> daos = ServiceLoader.load(Dao.class);
        Dao dao = daos.findFirst().get();

        System.out.println("All:");
        dao.findAll().forEach(System.out::println);
        System.out.println("By one:");
        dao.findByLogin("kko").ifPresent(System.out::println);

    }
}
