package services.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;
import services.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        try {
            userDao = new UserDaoImpl();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public User read(Integer id) {
        return userDao.read(id);
    }

    @Override
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public List<User> readAll() {
        return userDao.readAll();
    }
}
