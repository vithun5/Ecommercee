package org.example.ecom.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
public class getInstructorDtos {
    private UUID id;
    private String name;
    private String email;
    private List<String> batchName;
    private List<Long> batchId;
}
