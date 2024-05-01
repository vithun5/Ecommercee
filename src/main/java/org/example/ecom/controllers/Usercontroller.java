package org.example.ecom.controllers;

import org.example.ecom.Model.Instructor;
import org.example.ecom.Model.User;

import org.example.ecom.dtos.createUserDtos;
import org.example.ecom.services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {

    public final UserServices userServices;
    public Usercontroller(UserServices userServices) {
        this.userServices = userServices;
    }
    @PostMapping()
    public User createUser(@RequestBody createUserDtos CreateUserDto){

        return userServices.createUser(CreateUserDto.getName(),CreateUserDto.getEmail());
    }
    @GetMapping("/{name}")
    public List<User> getUserByName(@PathVariable(name="name") String name){
        return userServices.getUserByName(name);
    }
    @GetMapping("/{instructor}/{name}")
    public List<Instructor> getInstructorByName(@PathVariable(name="name") String name){
        return userServices.getInstructorByName(name);
    }
    @PostMapping("/instructor")
    public Instructor createInstructor(@RequestBody createUserDtos CreateUserDto){

        return userServices.createInstructor(CreateUserDto.getName(),CreateUserDto.getEmail());
    }

}
