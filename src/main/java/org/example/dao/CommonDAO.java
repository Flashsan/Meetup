package org.example.dao;

import java.sql.SQLException;
import java.util.List;

public interface CommonDAO<T> {

    List<T> getAll() throws SQLException;

    void getById(int id) throws SQLException;

    boolean save(T t) throws SQLException;

    void update(T t) throws SQLException;

    int delete(T t) throws SQLException;
}
