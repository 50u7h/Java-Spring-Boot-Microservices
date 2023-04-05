package com.guney.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return service.findUser(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }
}
