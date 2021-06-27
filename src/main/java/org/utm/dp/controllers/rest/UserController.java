package org.utm.dp.controllers.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.utm.dp.entity.dto.UserDto;
import org.utm.dp.service.UserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/users")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserDto userDto, HttpServletResponse response) {
        try {
            response.addCookie(new Cookie("username", userDto.getUsername()));
            userService.addUser(userDto);
            return new ResponseEntity<>("User saved", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Could not add user", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/progress")
    public ResponseEntity<?> getProgress(HttpServletRequest request) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
