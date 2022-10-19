package ru.spring.web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.spring.web.dao.UserDAO;
import ru.spring.web.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User onUser(long id) {
        return userDAO.onUser(id);
    }

    @Transactional
    @Override
    public void createOrUpdate(User user) {
        if (0 == user.getId()) {
            userDAO.create(user);
        } else {
            userDAO.update(user);
        }
    }

    @Transactional
    @Override
    public User deleteUser(long id) {
        return userDAO.delete(id);
    }
}
