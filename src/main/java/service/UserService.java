package service;

import table.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by FromxSoul on 15.07.2016.
 */
public interface UserService {

    User getUserById(int id) throws SQLException;
    User getUserByFirstName(String firstName) throws SQLException;
    User getUserByLogin(String login) throws SQLException;
    void addUser(User user) throws SQLException;
    void editUser(User user) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    void deleteUser(int id) throws SQLException;
    boolean isUserExist(User user) throws SQLException;

}
