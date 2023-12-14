package com.codebay.goldeneye.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codebay.goldeneye.Models.City;
import java.util.List;

// CITY REPOSITORY 

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findAll();

}
