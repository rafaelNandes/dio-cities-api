package com.github.rafaelNandes.countries.repositories;

import com.github.rafaelNandes.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
