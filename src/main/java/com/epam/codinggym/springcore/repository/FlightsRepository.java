package com.epam.codinggym.springcore.repository;

import com.epam.codinggym.springcore.domain.FlightsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepository extends JpaRepository<FlightsInfo, Long> {
}
