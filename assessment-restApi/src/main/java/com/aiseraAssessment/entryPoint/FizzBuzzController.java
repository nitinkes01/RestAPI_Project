package com.aiseraAssessment.entryPoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	@GetMapping("/fizzbuzz/{number}")
    public String fizzBuzz(@PathVariable int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

}


