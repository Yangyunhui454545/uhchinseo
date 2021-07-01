package com.lightningboys.uhchinseo.Repository;

import com.lightningboys.uhchinseo.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);


    @Modifying
    @Query("update User u set u.score =:totalScore where u.id =:id")
    void updateScore(@Param("id")Long id, @Param("totalScore")int totalScore);

    Optional<User>findByNickname(String nickName);


}
