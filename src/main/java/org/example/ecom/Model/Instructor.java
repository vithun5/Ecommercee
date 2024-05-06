package org.example.ecom.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Instructor extends User{
    private Double Salary;
    private String skill;
    @OneToMany(fetch = jakarta.persistence.FetchType.EAGER, mappedBy = "instructor", cascade = CascadeType.REMOVE)
    private List<Batch> batch;
}
