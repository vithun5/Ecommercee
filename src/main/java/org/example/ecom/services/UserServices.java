package org.example.ecom.services;

import org.example.ecom.Model.Batch;
import org.example.ecom.Model.Instructor;
import org.example.ecom.Model.User;
import org.example.ecom.Repository.InstructorRepository;
import org.example.ecom.Repository.UserRepository;
import org.example.ecom.dtos.getInstructorDtos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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


    public List<getInstructorDtos> getInstructorByName(String name){
        List<Instructor> instructors = instructorRepository.findByName(name);
        List<getInstructorDtos> instructorDtos = new ArrayList<>();
        for(Instructor instructor : instructors){
            getInstructorDtos GetinstructorDto = new getInstructorDtos();
            GetinstructorDto.setId(instructor.getId());
            GetinstructorDto.setName(instructor.getName());
            GetinstructorDto.setEmail(instructor.getEmail());
            List<String> batchNames = new ArrayList<>();
            List<Long> ids = new ArrayList<>();
            for(Batch batch: instructor.getBatch()){
                batchNames.add(batch.getName());
                ids.add(batch.getId());
            }
            GetinstructorDto.setBatchName(batchNames);
            GetinstructorDto.setBatchId(ids);
            instructorDtos.add(GetinstructorDto);
        }
        return instructorDtos;
    }
}
