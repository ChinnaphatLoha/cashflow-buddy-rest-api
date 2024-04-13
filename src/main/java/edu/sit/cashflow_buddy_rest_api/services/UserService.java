package edu.sit.cashflow_buddy_rest_api.services;

import edu.sit.cashflow_buddy_rest_api.dto.NewGoogleUserDto;
import edu.sit.cashflow_buddy_rest_api.dto.UserDto;
import edu.sit.cashflow_buddy_rest_api.entities.User;
import edu.sit.cashflow_buddy_rest_api.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    private final UserRepository userRepository;

    ModelMapper mapper;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.mapper = new ModelMapper();
    }

    // CREATE GOOGLE USER
    public UserDto createGoogleUser(NewGoogleUserDto userToCreate) {
        User user = mapper.map(userToCreate, User.class);
        return mapper.map(userRepository.save(user), UserDto.class);
    }

    // GET PROFILE BY ID
    public UserDto getProfileById(String userId) {
        // TODO: Implement getting a user's profile by ID (maybe use Google ID)
        return null;
    }

    // UPDATE PROFILE
    public UserDto updateProfile(String userId, UserDto user) {
        // TODO: Implement updating a user's profile
        return null;
    }

    // DELETE PROFILE
    public void deleteProfile(String userId) {
        // TODO: Implement deleting a user's profile
    }
}
