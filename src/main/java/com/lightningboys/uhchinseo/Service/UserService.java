package com.lightningboys.uhchinseo.Service;

import com.lightningboys.uhchinseo.Domain.User;
import com.lightningboys.uhchinseo.Repository.UserRepo;
import com.lightningboys.uhchinseo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserRepo userRepo;

    public Optional<User> findById(Long id){
        Optional<User> user= userRepository.findById(id);
        return user;
    }

    public Optional<User> findByNickName(String nickName){
        try{
            Optional<User> user = userRepository.findByNickname(nickName);
            return user;
        }catch (EmptyResultDataAccessException e){
            Optional<User> user = null;
            return user;
        }
    }

    @Transactional
   public void save(User user){
        userRepo.save(user);
   }
}
