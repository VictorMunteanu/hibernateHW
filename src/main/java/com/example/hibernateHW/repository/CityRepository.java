package com.example.hibernateHW.repository;

import com.example.hibernateHW.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
