package com.ygorftf.course.resources;

import com.ygorftf.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User test = new User(1L,"ygor","ygorftf@gmail.com","999999999","1234569");
        return ResponseEntity.ok(test);
    }
}
