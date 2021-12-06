package com.sages.ocap.daoUser;


import com.sages.ocap.dao.Dao;
import com.sages.ocap.entity.Trener;

import java.util.*;

public class UserDao implements Dao<Trener> {

    private final Map<String, Trener> treners;

    public UserDao() {
        treners = new TreeMap<>();
        treners.put("kko",new Trener("kko", "Krzysiek"));
        treners.put("jla",new Trener("jla", "Jola"));
        treners.put("jko",new Trener("jko", "Jakub"));
    }

    @Override
    public Optional<Trener> findByLogin(String login) {
        return Optional.ofNullable(treners.get(login));
    }

    @Override
    public List<Trener> findAll() {
        return new ArrayList<>(treners.values());
    }
}