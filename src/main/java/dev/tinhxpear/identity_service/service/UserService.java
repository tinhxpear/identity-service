package dev.tinhxpear.identity_service.service;

import dev.tinhxpear.identity_service.dto.request.UserCreationRequest;
import dev.tinhxpear.identity_service.entity.User;
import dev.tinhxpear.identity_service.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User createUser(UserCreationRequest request) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }
}
