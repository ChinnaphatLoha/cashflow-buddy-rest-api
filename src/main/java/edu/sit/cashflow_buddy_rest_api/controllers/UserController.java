package edu.sit.cashflow_buddy_rest_api.controllers;

import edu.sit.cashflow_buddy_rest_api.dto.NewGoogleUserDto;
import edu.sit.cashflow_buddy_rest_api.dto.UserDto;
import edu.sit.cashflow_buddy_rest_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/google")
    public UserDto createGoogleUser(@RequestBody NewGoogleUserDto userToCreate) {
        return userService.createGoogleUser(userToCreate);
    }
}
