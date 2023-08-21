package com.docker.docker.service;

import com.docker.docker.dto.EmployeeDto;
import com.docker.docker.entity.Employee;
import com.docker.docker.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

public EmployeeDto saveEmployee(EmployeeDto employeedto){

    Employee entity = employeeRepository.save(modelMapper.map(employeedto,Employee.class));
    EmployeeDto saveEmployeeDto = modelMapper.map(entity,EmployeeDto.class);

    return saveEmployeeDto;
}

public List<EmployeeDto> getEmployee(){
    List<Employee> employeeList = employeeRepository.findAll();
    List<EmployeeDto> employeeDtos = employeeList.stream().map(e -> modelMapper.map(e,EmployeeDto.class)).collect(Collectors.toList());
    return employeeDtos;
}

}
