package org.example.ecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST )
public class NotFoundException extends Exception{

    public NotFoundException(){
        super("The Product ID is not Found. ");
    }
}
