package table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by FromxSoul on 14.07.2016.
 */
@Entity
@Table(name = "user_spr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;



    @NotEmpty(message = "please, enter first your name")
    @Column(name = "first_name")
    private String firstName;


    @NotEmpty(message = "please, enter your last name")
    @Column(name = "last_name")
    private String lastName;



    @NotNull(message = "please, enter your age")
    @Column(name = "age")
    private int age;


    @NotEmpty(message = "please, enter your login")
    @Column(name = "login", unique = true)
    private String login;


    @NotEmpty(message = "please, enter your password")
    @Column(name = "password")
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
