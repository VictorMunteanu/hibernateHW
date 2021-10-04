package com.example.hibernateHW.service;

import com.example.hibernateHW.model.Country;

import java.util.List;

public interface CountryService {
    Country save(Country country);

    List<Country> getAll();

    Country get(long id);

    Country update(Country country, long id);
}
