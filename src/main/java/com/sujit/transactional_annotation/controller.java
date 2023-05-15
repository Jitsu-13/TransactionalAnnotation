package com.sujit.transactional_annotation;

import com.sujit.transactional_annotation.model.Employee;
import com.sujit.transactional_annotation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class controller {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws Exception{
        Employee employeeSavedTODB=this.employeeService.addEmployee(employee);

        return new ResponseEntity<Employee>(employeeSavedTODB, HttpStatus.CREATED);

    }
}
