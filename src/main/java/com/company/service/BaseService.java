package com.company.service;

import java.util.List;

public interface BaseService<T> {

    T get(Integer id);

    List<T> getList();

    T save(T entity);

    void delete(Integer id);
}
