package com.aiseraAssessment.assessmentrestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.aiseraAssessment.entryPoint.FizzBuzzController;

@SpringBootApplication
@ComponentScan(basePackageClasses = FizzBuzzController.class)
public class AssessmentRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentRestApiApplication.class, args);
	}

}
