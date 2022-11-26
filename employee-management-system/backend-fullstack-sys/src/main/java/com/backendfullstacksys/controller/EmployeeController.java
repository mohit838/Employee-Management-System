package com.backendfullstacksys.controller;

import com.backendfullstacksys.entities.EmployeeEntity;
import com.backendfullstacksys.model.EmployeeReqDto;
import com.backendfullstacksys.services.EmployeeServiceImplement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
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

    @PostMapping("save")
    public EmployeeEntity save(@RequestBody EmployeeReqDto employeeReqDto){
        return employeeServiceImplement.create(employeeReqDto);
    }

    @PutMapping("update/{id}")
    public EmployeeEntity update(@RequestBody EmployeeReqDto employeeReqDto, @PathVariable Long id) {
        return employeeServiceImplement.update(employeeReqDto, id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        employeeServiceImplement.delete(id);
    }
}

//5. Controller