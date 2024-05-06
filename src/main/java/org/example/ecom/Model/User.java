package org.example.ecom.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;


@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@MappedSuperclass
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @Column(name="email_address" , unique = true)
    private String email;
}
