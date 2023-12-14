package com.codebay.goldeneye.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codebay.goldeneye.Models.City;
import com.codebay.goldeneye.Models.Officedepartment;
import java.util.List;

// OFFICE DEPARTMENT REPOSITORY 

public interface OfficeDepartmentRepository extends JpaRepository<Officedepartment, Long> {
    List<Officedepartment> findByCity(City city);
}