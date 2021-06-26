package com.lightningboys.uhchinseo.Service;

import com.lightningboys.uhchinseo.Domain.User;
import com.lightningboys.uhchinseo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findById(Long id){
        Optional<User> user= userRepository.findById(id);
        return user;
    }
}
