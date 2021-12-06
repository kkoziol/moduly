package com.sages.ocap.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> findByLogin(String login);

    List<T> findAll();

}