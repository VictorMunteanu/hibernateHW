package com.example.hibernateHW.repository;

import com.example.hibernateHW.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
