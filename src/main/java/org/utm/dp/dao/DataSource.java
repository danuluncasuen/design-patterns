package org.utm.dp.dao;

import org.utm.dp.entity.Riddle;
import org.utm.dp.entity.User;
import org.utm.dp.utils.DataSourcePrototype;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private static DataSource dataSource = null;
    DataSourcePrototype<User> dataSourcePrototypeUser = new DataSourcePrototype<>(new ArrayList<>());
    DataSourcePrototype<Riddle> dataSourcePrototypeRiddles = new DataSourcePrototype<>(new ArrayList<>());

    private DataSource() {}

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new DataSource();
        }
        return dataSource;
    }

    public void addUser(User user) {
        dataSourcePrototypeUser.getListOfEntities().add(user);
    }

    public void addRiddle(Riddle riddle) {
        dataSourcePrototypeRiddles.getListOfEntities().add(riddle);
    }

    public List<Riddle> getRiddles() {
        return dataSourcePrototypeRiddles.clone().getListOfEntities();
    }

    public Long getLastUserId() {
        if (dataSourcePrototypeUser.getListOfEntities().size() == 0) {
            return 0L;
        }
        return dataSourcePrototypeUser.getListOfEntities().get(dataSourcePrototypeUser.getListOfEntities().size()-1).getId();
    }

    public List<User> getUsers() {
        return dataSourcePrototypeUser.clone().getListOfEntities();
    }

    public boolean testClone() {
        return dataSourcePrototypeRiddles.getListOfEntities() == dataSourcePrototypeRiddles.clone().getListOfEntities();
    }
}
