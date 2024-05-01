package org.example.ecom.Repository;

import org.example.ecom.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
List<Instructor> findByName(String name);
}
