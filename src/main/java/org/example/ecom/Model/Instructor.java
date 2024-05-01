package org.example.ecom.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends User{
    private Double Salary;
    private String skill;
}
