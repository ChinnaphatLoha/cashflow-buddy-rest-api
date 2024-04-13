package edu.sit.cashflow_buddy_rest_api.controllers;

import edu.sit.cashflow_buddy_rest_api.dto.NewGoogleUserDto;
import edu.sit.cashflow_buddy_rest_api.dto.UserResponseDto;
import edu.sit.cashflow_buddy_rest_api.dto.UserUpdateDto;
import edu.sit.cashflow_buddy_rest_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/google")
    public ResponseEntity<UserResponseDto> createGoogleUser(@RequestBody NewGoogleUserDto userToBeCreated) {
        UserResponseDto createdUser = userService.createGoogleUser(userToBeCreated);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDto> getProfileById(@PathVariable String userId) {
        UserResponseDto user = userService.getProfileById(userId);
        return ResponseEntity.ok(user);
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<UserResponseDto> updateProfile(@PathVariable String userId, @RequestBody UserUpdateDto updateData) {
        UserResponseDto updatedUser = userService.updateProfile(userId, updateData);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deactivateProfile(@PathVariable String userId) {
        userService.deactivateProfile(userId);
        return ResponseEntity.noContent().build();
    }
}
