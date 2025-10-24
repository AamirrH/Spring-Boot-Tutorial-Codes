package com.Spring.RESTful.APIs.CodingShuttleCourse.repositories;

// Basically an interface/medium through which data will be obtained and passed to service layer for some business logic operation

import com.Spring.RESTful.APIs.CodingShuttleCourse.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {




}
