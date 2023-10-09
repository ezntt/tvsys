package com.tvsys.controller;

import com.tvsys.entity.Employee;
import com.tvsys.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/employees", method = RequestMethod.POST)
    public void create(@RequestBody Employee employee) {

        employeeRepository.save(employee);

    }

    @ResponseBody
    @GetMapping("/employees")
    public List<Employee> read() {

        List<Employee> employees = employeeRepository.findAll();

        return employees;

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/employees", method = RequestMethod.PUT)
    public void update(@RequestBody Employee employee) {

        employeeRepository.save(employee);

    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/employees/{employeeId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long employeeId){

        employeeRepository.deleteById(employeeId);

    }

}
