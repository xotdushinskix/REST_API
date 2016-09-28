package main_help;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import table.User;

import java.sql.SQLException;

/**
 * Created by nikita on 19.07.16.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/home/nikita/HomeJava/MVC_spr/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml");
        UserService userService = applicationContext.getBean(UserService.class);

        User user = new User();
        user.setFirstName("David");
        user.setLastName("Carroth");
        user.setAge(51);
        user.setPassword("dav_car");
        user.setLogin("david.carroth@gmail.com");
        userService.addUser(user);
        //User user = userService.editUser(1);
        //user.setAge(24);
        //userService.editUser(user);

//        User user = userService.getUserById(1);
//        user.setAge(100);
//        userService.editUser(user);

    }

}
