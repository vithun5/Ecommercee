package org.example.ecom.services;

import org.example.ecom.Model.Instructor;
import org.example.ecom.Model.User;
import org.example.ecom.Repository.InstructorRepository;
import org.example.ecom.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    public final  UserRepository userRepository;
    public final InstructorRepository instructorRepository;

    public UserServices(UserRepository userRepository, InstructorRepository instructorRepository) {
        this.userRepository = userRepository;
        this.instructorRepository = instructorRepository;
    }


    // creating user
    public User createUser(String name, String email ){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }
    public Instructor createInstructor(String name, String email ){
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setEmail(email);
        instructor.setSalary(400000.000);
        instructor.setSkill("java");
        instructorRepository.save(instructor);
        return instructor;
    }
//    getting user by name
    public List<User> getUserByName(String name){
        return userRepository.findByName(name);
    }
    public List<Instructor> getInstructorByName(String name){
        return instructorRepository.findByName(name);
    }
}
