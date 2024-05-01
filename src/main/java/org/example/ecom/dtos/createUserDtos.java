package org.example.ecom.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public  class createUserDtos {
    private String name;
    private String email;
}
