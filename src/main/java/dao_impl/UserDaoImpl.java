package dao_impl;

import dao.UserDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import table.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by FromxSoul on 15.07.2016.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserById(int id) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = sessionFactory.openSession();
            user = (User) session.get(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return user;
    }


    @Override
    public User getUserByFirstName(String firstName) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(User.class);
            user = (User) criteria.add(Restrictions.like("firstName", firstName)).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return user;
    }


    @Override
    public User getUserByLogin(String login) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(User.class);
            user = (User) criteria.add(Restrictions.like("login", login)).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return user;
    }


    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }


    @Override
    public void editUser(User user) throws SQLException {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }


    @Override
    public List<User> getAllUsers() throws SQLException {
        List<User> users = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            users = session.createCriteria(User.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return users;
    }


    @Override
    public void deleteUser(int id) throws SQLException {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            User user = getUserById(id);
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }


    }



    @Override
    public boolean isUserExist(User user) throws SQLException {
        return getUserByFirstName(user.getLogin()) != null;
    }
}
