package org.utm.dp.utils;

import java.util.ArrayList;
import java.util.List;

public class DataSourcePrototype<T> implements DataSourceListPrototype<T> {

    private final List<T> entities;

    public DataSourcePrototype(List<T> entities) {
        this.entities = entities;
    }

    @Override
    public List<T> getListOfEntities() {
        return entities;
    }

    @Override
    public DataSourcePrototype<T> clone() {
        return new DataSourcePrototype<>(new ArrayList<>(entities));
    }
}
