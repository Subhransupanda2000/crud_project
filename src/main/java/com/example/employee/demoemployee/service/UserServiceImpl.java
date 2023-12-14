package com.example.employee.demoemployee.service;

import com.example.employee.demoemployee.entity.User;
import com.example.employee.demoemployee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUsers() {
        return userRepository.findAll();
    }

    @Override
    public User fetchUsersById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void removeUserById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(String Id,User user) {
        User depDb=userRepository.findById(Id).get();
        if (Objects.nonNull(user.getId())&& !"".equalsIgnoreCase(user.getId()))
        {
            depDb.setId(user.getId());
        }
        if (Objects.nonNull(user.getName())&& !"".equalsIgnoreCase(user.getName()))
        {
            depDb.setName(user.getName());
        }
        if (Objects.nonNull(user.getLocation())&& !"".equalsIgnoreCase(user.getLocation()))
        {
            depDb.setLocation(user.getLocation());
        }
        if (Objects.nonNull(user.getDepartmentName())&& !"".equalsIgnoreCase(user.getDepartmentName()))
        {
            depDb.setDepartmentName(user.getDepartmentName());
        }
        return userRepository.save(depDb);
    }

    @Override
    public User fetchUsersByName(String departmentName) {
        return userRepository.findByDepartmentName(departmentName);
    }
}
