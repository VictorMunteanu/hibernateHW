package com.example.hibernateHW.controller;

import com.example.hibernateHW.model.City;
import com.example.hibernateHW.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {
    private CityService cityService;

    public CityController(CityService cityService) {
        super();
        this.cityService = cityService;
    }

    @PostMapping
    public ResponseEntity<City> create(@RequestBody City city) {
        return new ResponseEntity<City>(cityService.save(city), HttpStatus.CREATED);
    }
}
