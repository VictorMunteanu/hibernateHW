package com.example.hibernateHW.service.impl;

import com.example.hibernateHW.model.City;
import com.example.hibernateHW.repository.CityRepository;
import com.example.hibernateHW.service.CityService;

public class CityServiceImpl implements CityService {
    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        super();
        this.cityRepository = cityRepository;
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }
}
