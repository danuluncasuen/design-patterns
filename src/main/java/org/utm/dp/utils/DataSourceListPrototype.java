package org.utm.dp.utils;

import java.util.List;

public interface DataSourceListPrototype<T> extends Cloneable {
    List<T> getListOfEntities();
    DataSourceListPrototype<T> clone();
}
