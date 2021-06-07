package org.utm.dp.service;

import org.springframework.stereotype.Service;
import org.utm.dp.dao.DataSource;
import org.utm.dp.entity.User;
import org.utm.dp.entity.dto.UserDto;

@Service
public class UserService {

    DataSource dataSource = DataSource.getDataSource();

    public void addUser(UserDto userDto) {
        dataSource.addUser(new User()
                .setId(dataSource.getLastUserId())
                .setRiddleOrder(1)
                .setUsername(userDto.getUsername())
        );
    }

}
