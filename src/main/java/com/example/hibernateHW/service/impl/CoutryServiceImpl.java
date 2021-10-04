package com.example.hibernateHW.service.impl;

import com.example.hibernateHW.model.Country;
import com.example.hibernateHW.repository.CountryRepository;
import com.example.hibernateHW.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CoutryServiceImpl implements CountryService {
    CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        super();
        this.countryRepository = countryRepository;
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

}
