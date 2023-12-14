package com.codebay.goldeneye.Services;

import com.codebay.goldeneye.Models.City;
import com.codebay.goldeneye.Models.Officedepartment;
import com.codebay.goldeneye.Repositories.CityRepository;
import com.codebay.goldeneye.Repositories.OfficeDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

// CITY SERVICE 

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private OfficeDepartmentRepository departmentRepository;

    public List<Officedepartment> getDepartmentsByCity(Long idCiudad) {
        Optional<City> city = cityRepository.findById(idCiudad);
        if (city.isPresent()) {
            return departmentRepository.findByCity(city.get());
        } else {
            // Handle the case where the city is not found
            return Collections.emptyList();
        }

    }

    public List<City> getCities() {
        List<City> cities = cityRepository.findAll();
        return cities;
    }
}