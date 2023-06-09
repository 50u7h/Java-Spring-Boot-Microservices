package com.guney.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    /*static {
        users.add(new User(++usersCount, "test TEST", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "qwerty QWERTY", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "zxcvb ZCVBN", LocalDate.now().minusYears(20)));
    }*/

    public List<User> getUsers() {
        return users;
    }

    public User findUser(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveUser(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteUser(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
