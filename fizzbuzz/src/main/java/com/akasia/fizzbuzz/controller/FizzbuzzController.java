package com.akasia.fizzbuzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.akasia.fizzbuzz.dto.responseDto;
import com.akasia.fizzbuzz.services.FizzbuzzServices;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("test")
public class FizzbuzzController {

    @Autowired
    public FizzbuzzServices fizzbuzzServices;
    Logger logger = Logger.getLogger("FizzBuzz");

    @GetMapping("/{length}")
    public ResponseEntity<responseDto> getFizzbuzz(@PathVariable Integer length)
    {
        responseDto response = new responseDto();

        try {
            // TODO: generate fizzbuzz with length
            StringBuilder result = fizzbuzzServices.generateFizzbuzz(length);
            logger.info(result.toString());
            // TODO: set response
            response.setSuccess(Boolean.TRUE);
            response.setMessage("See the result in console");

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // TODO: set error response
            response.setSuccess(Boolean.FALSE);
            response.setMessage("Bad Request");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }
}
