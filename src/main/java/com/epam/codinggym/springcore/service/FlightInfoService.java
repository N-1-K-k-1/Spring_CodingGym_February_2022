package com.epam.codinggym.springcore.service;

import com.epam.codinggym.springcore.domain.FlightsInfo;
import com.epam.codinggym.springcore.domain.FlightsInfoDto;
import com.epam.codinggym.springcore.repository.FlightsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightInfoService {

    private final FlightsRepository flightsRepository;

    public FlightInfoService(final FlightsRepository flightsRepository) {
        this.flightsRepository = flightsRepository;
    }

    public List<FlightsInfoDto> getFlights() {
        List<FlightsInfo> all = flightsRepository.findAll();
        List<FlightsInfoDto> flightsInfoDtos = new ArrayList<>();
        all.forEach(flightsInfo -> flightsInfoDtos.add(flightsInfo.flightsInfoToFlightsInfoDto(flightsInfo)));

        return flightsInfoDtos;
    }
}
