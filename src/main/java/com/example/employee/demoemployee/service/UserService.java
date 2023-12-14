package com.example.employee.demoemployee.service;


import com.example.employee.demoemployee.entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public   List<User> fetchUsers();

    public   User fetchUsersById(String id);

    public void removeUserById(String id);
    public User updateUser(String id,User user);

    public User fetchUsersByName(String departmentName);
}
