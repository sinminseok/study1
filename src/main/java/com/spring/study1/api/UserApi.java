package com.spring.study1.api;


import com.spring.study1.service.UserService;
import com.spring.study1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class UserApi {

    @Autowired
    private UserService userService;

    @PostMapping("/api/user")
    public ResponseEntity<String> save(
             @RequestBody User user
    ) throws Exception {
        userService.save(user);
        return ResponseEntity.ok("success save user");
    }

    @GetMapping("/api/user")
    public ResponseEntity<List<User>> findall(){
        List<User> findall = userService.findall();
        return ResponseEntity.ok(findall);
    }


}
