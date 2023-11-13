package com.brunomatosbarbosa.course.resources;

import com.brunomatosbarbosa.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Bruno", "Bruno@gmail.com", "99999999", "123");
        return ResponseEntity.ok().body(u);
    }
}
