package com.Spring.RESTful.APIs.CodingShuttleCourse;

import com.Spring.RESTful.APIs.CodingShuttleCourse.dto.EmployeeDTO;
import com.Spring.RESTful.APIs.CodingShuttleCourse.entities.EmployeeEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryDependsOnPostProcessor;

@SpringBootApplication
public class CodingShuttleCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingShuttleCourseApplication.class, args);

	}


}
