package com.backendfullstacksys.repository;

import com.backendfullstacksys.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

    //Part to be used for custom Queries
}

//3. Repo