package com.demo.springsecurity.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestParam String username, @RequestParam String password){
         return new ResponseEntity(userService.loginUser(username,password), HttpStatus.OK);
    }

    @GetMapping("/getData2")
    public ResponseEntity test2(){
        return new ResponseEntity("Testing2", HttpStatus.OK);
    }

    @GetMapping("/getData")
    public ResponseEntity test(){
        return new ResponseEntity("Testing", HttpStatus.OK);
    }
}
