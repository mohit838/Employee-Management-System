package com.backendfullstacksys.controller;

import com.backendfullstacksys.entities.EmployeeEntity;
import com.backendfullstacksys.model.EmployeeReqDto;
import com.backendfullstacksys.services.EmployeeServiceImplement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee/")

public class EmployeeController {

    final EmployeeServiceImplement employeeServiceImplement;


    public EmployeeController(EmployeeServiceImplement employeeServiceImplement) {
        this.employeeServiceImplement = employeeServiceImplement;
    }

    @GetMapping
    public List<EmployeeEntity> getAll(){
        return employeeServiceImplement.get();
    }

    @GetMapping("{id}")
    public EmployeeEntity getById(@PathVariable Long id){
        return employeeServiceImplement.getById(id);
    }

    @PostMapping
    public EmployeeEntity save(@RequestBody EmployeeReqDto){
        
    }
}

//5. Controller