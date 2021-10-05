package com.example.hibernateHW.service;

import com.example.hibernateHW.model.City;

import java.util.List;

public interface CityService {
    City save(City city);

    List<City> getAll();

    City get(long id);

    City update(City City, long id);

    void delete(long id);
}
