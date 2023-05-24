package com.spring.study1.repository;

import com.spring.study1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public List<User> findall(){
        return users;
    }

}
