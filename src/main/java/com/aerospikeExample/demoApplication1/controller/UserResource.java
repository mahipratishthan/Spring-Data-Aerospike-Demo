package com.aerospikeExample.demoApplication1.controller;

import com.aerospikeExample.demoApplication1.model.AccountBalance;
import com.aerospikeExample.demoApplication1.model.accountbalance1;
import com.aerospikeExample.demoApplication1.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserResource {

    @Autowired
    UserService userService;
    @GetMapping("/users/{pkv}")
    public accountbalance1 readUserById(@PathVariable("pkv") String pkv) {
        return userService.readUserById(pkv);
    }
    @PostMapping("/users")
    public void addUser(@RequestBody AccountBalance accountbalance) {
        userService.addUser(accountbalance);
    }
    @DeleteMapping("/users/{pkv}")
    public void deleteUserById(@PathVariable("pkv") String pkv) {
        userService.removeUserById(pkv);
    }
}
