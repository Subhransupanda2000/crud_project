package com.example.employee.demoemployee.controller;


import com.example.employee.demoemployee.entity.User;
import com.example.employee.demoemployee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> fetchUsers() {
        return userService.fetchUsers();
    }

    @GetMapping("/{id}")
    public User fetchUserById(@PathVariable("id") String id) {
        return userService.fetchUsersById(id);
    }

    @DeleteMapping("/{id}")
    public String removeUserById(@PathVariable("id") String id) {
        userService.removeUserById(id);
        return id;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") String id, @RequestBody User user) {

        return userService.updateUser(id, user);
    }

    @GetMapping("/userByName/{departmentName}")
    public User fetchUserByName(@PathVariable("departmentName") String departmentName) {
        return userService.fetchUsersByName(departmentName);
    }

}
