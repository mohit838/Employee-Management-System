package com.backendfullstacksys.services;

import com.backendfullstacksys.entities.EmployeeEntity;
import com.backendfullstacksys.model.EmployeeReqDto;
import com.backendfullstacksys.model.EmployeeResDto;
import com.backendfullstacksys.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplement {
    final EmployeeRepo employeeRepo;
//EmpRepo Use for automatic queries operation on employee table

    public EmployeeServiceImplement(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeEntity create(EmployeeReqDto employeeReqDto) {

        return populateEntity(new EmployeeEntity(), employeeReqDto);
    }

    public EmployeeEntity update(EmployeeReqDto employeeReqDto, Long id) {

        EmployeeEntity employee = employeeRepo.findById(id).get();
        //Get act like Optionally

        return populateEntity(employee, employeeReqDto);
    }

    public List<EmployeeEntity> get() {
        return employeeRepo.findAll();

        //Need loop for custom response
    }

    public EmployeeEntity getById(Long id) {
        return employeeRepo.findById(id).get();
    }

    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }

    private EmployeeEntity populateEntity(EmployeeEntity employee, EmployeeReqDto employeeReqDto) {
        employee.setEmailId(employeeReqDto.getEmailId());
        employee.setFirstName(employeeReqDto.getFirstName());
        employee.setLastName(employeeReqDto.getLastName());

        return employeeRepo.save(employee);
    }


//Create Function for stop repetition

}


//4. Services

//Note:: All types of logics operationss