package edu.sit.cashflow_buddy_rest_api.services;

import edu.sit.cashflow_buddy_rest_api.dto.NewGoogleUserDto;
import edu.sit.cashflow_buddy_rest_api.dto.UserResponseDto;
import edu.sit.cashflow_buddy_rest_api.dto.UserUpdateDto;
import edu.sit.cashflow_buddy_rest_api.entities.User;
import edu.sit.cashflow_buddy_rest_api.repositories.UserRepository;
import edu.sit.cashflow_buddy_rest_api.utils.CrudUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public UserResponseDto createGoogleUser(NewGoogleUserDto userToBeCreated) {
        User user = mapper.map(userToBeCreated, User.class);
        return mapper.map(userRepository.save(user), UserResponseDto.class);
    }

    // GET PROFILE BY ID
    public UserResponseDto getProfileById(String userId) {
        User user = userRepository.findById(userId).orElseThrow();
        return mapper.map(user, UserResponseDto.class);
    }

    // UPDATE PROFILE
    public UserResponseDto updateProfile(String userId, UserUpdateDto updateData) {
        User user = userRepository.findById(userId).orElseThrow();
        CrudUtils.copyNonNullProperties(updateData, user);
        return mapper.map(userRepository.save(user), UserResponseDto.class);
    }

    // DELETE PROFILE
    public void deactivateProfile(String userId) {
        User user = userRepository.findById(userId).orElseThrow();
        user.setIsAvailable(false);
        userRepository.save(user);
    }
}
