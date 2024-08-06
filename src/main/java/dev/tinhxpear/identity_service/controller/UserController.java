package dev.tinhxpear.identity_service.controller;

import dev.tinhxpear.identity_service.dto.request.UserCreationRequest;
import dev.tinhxpear.identity_service.entity.User;
import dev.tinhxpear.identity_service.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }
}
