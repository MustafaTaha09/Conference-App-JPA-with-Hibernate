package com.example.conferenceusingjpa.repository;

import com.example.conferenceusingjpa.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(User user){
        //since we are doing a persist or save, we need to wrap this whole method in a transaction. go to user service and add the transactional annotation
        entityManager.persist(user);
        return user;
    }

}
