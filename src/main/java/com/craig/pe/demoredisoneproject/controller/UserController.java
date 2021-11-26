package com.craig.pe.demoredisoneproject.controller;

import com.craig.pe.demoredisoneproject.entities.User;
import com.craig.pe.demoredisoneproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.userService.findById(id);
    }

    @PatchMapping("/user/{id}/{salary}")
    public User updateSalary(@PathVariable Long id,@PathVariable float salary){
        return this.userService.updateSalary(id, salary);
    }

    @DeleteMapping("/user/{id}")
    public  void deleteById(@PathVariable Long id){
        this.userService.deleteById(id);
    }
}
