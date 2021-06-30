package com.lightningboys.uhchinseo.Repository;

import com.lightningboys.uhchinseo.Domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserRepo {
    private final EntityManager em;

    public void save(User user){
        em.persist(user);
    }
}
