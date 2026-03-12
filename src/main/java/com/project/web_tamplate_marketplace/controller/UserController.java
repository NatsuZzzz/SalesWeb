package com.project.web_tamplate_marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.web_tamplate_marketplace.entity.User;
import com.project.web_tamplate_marketplace.service.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // lấy danh sách user
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // lấy user theo id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    // tạo user
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    // xóa user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}