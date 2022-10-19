package ru.spring.web.service;

import ru.spring.web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User onUser(long id);

    User deleteUser(long parseUnsignedInt);

    void createOrUpdate(User user);
}
