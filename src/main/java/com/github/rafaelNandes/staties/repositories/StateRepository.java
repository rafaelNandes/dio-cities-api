package com.github.rafaelNandes.staties.repositories;

import com.github.rafaelNandes.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
