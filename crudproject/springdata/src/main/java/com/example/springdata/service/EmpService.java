package com.example.springdata.service;

import com.example.springdata.model.Employee;
import com.example.springdata.repository.EmpRepo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired

    private EmpRepo empRepo;

    public Employee getUser (Integer id){
        Optional<Employee>emp = this.empRepo.findById(1);

        return emp.orElse(new Employee());

    }
}
