package com.example.hibernateHW.service.impl;

import com.example.hibernateHW.exception.ResourceNotFoundException;
import com.example.hibernateHW.model.Country;
import com.example.hibernateHW.repository.CountryRepository;
import com.example.hibernateHW.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoutryServiceImpl implements CountryService {
    CountryRepository countryRepository;

    public CoutryServiceImpl(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country get(long id) {
        return countryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Country", "id", id));
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country update(Country country, long id) {
        Country existingCountry = countryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Country", "id", id));
        existingCountry.setName(country.getName());
        countryRepository.save(existingCountry);
        return null;
    }
}
