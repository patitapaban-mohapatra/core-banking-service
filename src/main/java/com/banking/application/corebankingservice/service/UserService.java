package com.banking.application.corebankingservice.service;

import com.banking.application.corebankingservice.dto.User;
import com.banking.application.corebankingservice.model.entity.UserEntity;
import com.banking.application.corebankingservice.model.mapper.UserMapper;
import com.banking.application.corebankingservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserMapper userMapper = new UserMapper();

    private final UserRepository userRepository;

    public User readUser(String identification) {
        UserEntity userEntity = userRepository.findByIdentificationNumber(identification).get();
        return userMapper.convertToDto(userEntity);
    }

    public List<User> readUsers(Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
    }
}
