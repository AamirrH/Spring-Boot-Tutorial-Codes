package com.Spring.RESTful.APIs.CodingShuttleCourse.services;


import com.Spring.RESTful.APIs.CodingShuttleCourse.dto.EmployeeDTO;
import com.Spring.RESTful.APIs.CodingShuttleCourse.entities.EmployeeEntity;
import com.Spring.RESTful.APIs.CodingShuttleCourse.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper mapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper mapper) {
        this.employeeRepository = employeeRepository;
        this.mapper = mapper;
    }


    public EmployeeDTO getEmployeebyE_ID (long id){
        EmployeeEntity employeeEntity1 = employeeRepository.findById(id).orElse(null);
        return mapper.map(employeeEntity1,EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees_E(){
        return mapper.map(employeeRepository.findAll(),EmployeeDTO.class);
    }
    public EmployeeDTO createNewEmployee_E(@RequestBody EmployeeEntity inputEmployee){
        EmployeeDTO employee_to_save = mapper.map(inputEmployee,EmployeeDTO.class);
        EmployeeEntity employeeEntity2 = employeeRepository.save(employee_to_save);
        return mapper.map(employeeEntity2,EmployeeDTO.class);
    }
    public EmployeeDTO updateEmployeebyId_E(long id, EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = mapper.map(employeeDTO,EmployeeEntity.class);
        if(getEmployeebyE_ID(id)== null){
            createNewEmployee_E(employeeDTO);
        }
    }


}
