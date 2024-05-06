package org.example.ecom.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter

public class Batch {
    @Id
    @GeneratedValue
    public Long id;
    public String name;
    @ManyToOne
    private Instructor instructor;
    public Integer Strength;
}
