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

    @PostMapping("/SaveUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/Users")
    public List<User> fetchUsers() {
        return userService.fetchUsers();
    }

    @GetMapping("/{Id}")
    public User fetchUserById(@PathVariable("Id") String Id) {
        return userService.fetchUsersById(Id);
    }

    @DeleteMapping("/{Id}")
    public String removeUserById(@PathVariable("Id") String Id) {
        userService.removeUserById(Id);
        return Id;
    }

    @PutMapping("/{Id}")
    public User updateUser(@PathVariable("Id") String Id, @RequestBody User user) {

        return userService.updateUser(Id, user);
    }

    @GetMapping("/userByName/{departmentName}")
    public User fetchUserByName(@PathVariable("departmentName") String departmentName) {
        return userService.fetchUsersByName(departmentName);
    }

}
