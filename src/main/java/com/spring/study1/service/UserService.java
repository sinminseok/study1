package com.spring.study1.service;

import com.spring.study1.entity.User;
import com.spring.study1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User userDto){
        User user = new User(userDto.getId(),userDto.getName(),userDto.getAge());
        userRepository.save(user);

    }

    public List<User> findall(){
        return userRepository.findall();
    }

//    public User update(){
//
//    }
}
