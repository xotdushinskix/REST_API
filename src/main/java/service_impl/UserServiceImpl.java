package service_impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;
import table.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by FromxSoul on 15.07.2016.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    @Transactional
    public User getUserById(int id) throws SQLException {
        return this.userDao.getUserById(id);
    }

    @Override
    @Transactional
    public User getUserByFirstName(String firstName) throws SQLException {
        return this.userDao.getUserByFirstName(firstName);
    }

    @Override
    public User getUserByLogin(String login) throws SQLException {
        return this.userDao.getUserByLogin(login);
    }

    @Override
    @Transactional
    public void addUser(User user) throws SQLException {
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public void editUser(User user) throws SQLException {
        this.userDao.editUser(user);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() throws SQLException {
        return this.userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void deleteUser(int id) throws SQLException {
        this.userDao.deleteUser(id);
    }

    @Override
    public boolean isUserExist(User user) throws SQLException {
        return getUserByFirstName(user.getLogin()) != null;
    }
}
