package com.example.employee.demoemployee.service;


import com.example.employee.demoemployee.entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public   List<User> fetchUsers();

    public   User fetchUsersById(String Id);

    public void removeUserById(String Id);
    public User updateUser(String Id,User user);

    public User fetchUsersByName(String departmentName);
}
