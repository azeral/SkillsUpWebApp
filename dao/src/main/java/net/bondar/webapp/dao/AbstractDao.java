package net.bondar.webapp.dao;

import java.util.Collection;

/**
 * Created by AzeraL on 06.10.2015.
 */
public interface AbstractDao<T> {
    long create(T t);
    Collection<T> getAll();
}
