package com.docker.docker.resource;

import com.docker.docker.dto.EmployeeDto;
import com.docker.docker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save-employee")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){

        return ResponseEntity.ok().body(employeeService.saveEmployee(employeeDto));
    }

    @RequestMapping("/get-employees")
    public ResponseEntity<List<EmployeeDto>> getEmployees(){
        return ResponseEntity.ok().body(employeeService.getEmployee());
    }
}
