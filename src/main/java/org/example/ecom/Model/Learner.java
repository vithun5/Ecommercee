package org.example.ecom.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Learner  extends User{
    private String university;
    private String  psp;



}


