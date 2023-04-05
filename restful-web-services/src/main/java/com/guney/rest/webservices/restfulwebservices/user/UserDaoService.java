package com.guney.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "test TEST", LocalDate.now().minusYears(30)));
        users.add(new User(2, "qwerty QWERTY", LocalDate.now().minusYears(25)));
        users.add(new User(3, "zxcvb ZCVBN", LocalDate.now().minusYears(20)));
    }

    public static List<User> getUsers() {
        return users;
    }

    /*public User findUser(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }*/
}
