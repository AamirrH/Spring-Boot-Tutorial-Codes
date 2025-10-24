package com.Spring.RESTful.APIs.CodingShuttleCourse.controllers;

import com.Spring.RESTful.APIs.CodingShuttleCourse.dto.EmployeeDTO;
import com.Spring.RESTful.APIs.CodingShuttleCourse.entities.EmployeeEntity;
import com.Spring.RESTful.APIs.CodingShuttleCourse.repositories.EmployeeRepository;
import com.Spring.RESTful.APIs.CodingShuttleCourse.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees/{employeeID}")
    public EmployeeDTO getEmployeebyId(@PathVariable long employeeID){
        return employeeService.getEmployeebyE_ID(employeeID);
    }
    @GetMapping(path = "/employees")
    public List<EmployeeDTO> getallEmployees(){
        return employeeService.getAllEmployees_E();

    }
    @PostMapping(path = "/employeesPOST" )
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeEntity inputemployee){
        return employeeService.createNewEmployee_E(inputemployee);
    }

    @PutMapping(path = "/employeesPUT")
        public EmployeeDTO updateEmployeebyId(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.updateEmployeebyId_E(employeeId, EmployeeDTO);
    }

    @RequestMapping("/order/{id}")
    public String returnOrderId(@PathVariable long id, @RequestParam(required = false) int orderNo, @RequestParam(required = false) String orderName){
        String details = "Order id: "+id+"\nOrder no: "+orderNo+"\nOrder name: "+orderName;
        if(details == null){
            return "Order id is"+String.valueOf(id);
        }
        else {
            return details;
        }
    }

}
