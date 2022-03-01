package com.epam.codinggym.springcore.controller;

import com.epam.codinggym.springcore.domain.FlightsInfoDto;
import com.epam.codinggym.springcore.service.FlightInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightsInfoController {

    private final FlightInfoService flightInfoService;

    public FlightsInfoController(final FlightInfoService flightInfoService) {
        this.flightInfoService = flightInfoService;
    }

    @GetMapping(produces = "application/xml")
    public List<FlightsInfoDto> getFlights() {
        return flightInfoService.getFlights();
    }
}
