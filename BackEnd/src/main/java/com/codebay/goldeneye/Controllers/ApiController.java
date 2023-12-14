package com.codebay.goldeneye.Controllers;

import com.codebay.goldeneye.Models.City;
import com.codebay.goldeneye.Models.Officedepartment;
import com.codebay.goldeneye.Services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CONTROLLER FOR DEPARTMENTS AND CITIES API

// DEPARTMENTS API 

@RestController

@RequestMapping("/api")
public class ApiController {
    @Autowired
    private CityService cityService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}/departamentos")
    public ResponseEntity<List<Officedepartment>> getDepartmentsByCity(@PathVariable Long id) {
        List<Officedepartment> departments = cityService.getDepartmentsByCity(id);
        ResponseEntity responseEntity = new ResponseEntity<>(departments, HttpStatus.OK);
        return responseEntity;
    }

    // CITIES API
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ciudades")
    public ResponseEntity<List<City>> getCities() {
        List<City> cities = cityService.getCities();
            if (!cities.isEmpty()) {
                return new ResponseEntity<>(cities,HttpStatus.OK);
            } else {
                return new ResponseEntity<>(cities,HttpStatus.NOT_FOUND);
            }
        }
    }
