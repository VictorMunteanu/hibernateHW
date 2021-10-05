package com.example.hibernateHW.service.impl;

import com.example.hibernateHW.exception.ResourceNotFoundException;
import com.example.hibernateHW.model.City;
import com.example.hibernateHW.repository.CityRepository;
import com.example.hibernateHW.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City get(long id) {
        return cityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("City", "id", id));
    }

    @Override
    public City update(City city, long id) {
        City existingCity = cityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("City", "id", id));
        existingCity.setName(city.getName());
        cityRepository.save(existingCity);
        return null;
    }

    @Override
    public void delete(long id) {
        cityRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("City", "id", id));
        cityRepository.deleteById(id);
    }
}
