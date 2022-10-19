package ru.spring.web.dao;

import ru.spring.web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void create(User user);

    void update(User user);

    User onUser(long id);

    User delete(long id);
}
