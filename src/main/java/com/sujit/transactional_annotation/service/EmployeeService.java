package com.sujit.transactional_annotation.service;

import com.sujit.transactional_annotation.model.Address;
import com.sujit.transactional_annotation.model.Employee;
import com.sujit.transactional_annotation.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRespository employeeRespository;
    @Autowired
    private AddressService addressService;

    @Transactional
    public Employee addEmployee(Employee employee) throws Exception{
        Employee employeeSavedToDB=this.employeeRespository.save(employee);
        Address address=null;
        address.setId(123L);
        address.setAddress("varanasi");
        address.setEmployee(employee);

        this.addressService.addAddress(address);
        return employeeSavedToDB;

    }
}
