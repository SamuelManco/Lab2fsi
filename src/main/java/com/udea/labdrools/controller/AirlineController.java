package com.udea.labdrools.controller;

import com.udea.labdrools.model.AirlineRequest;
import com.udea.labdrools.model.Passenger;
import com.udea.labdrools.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airline/api")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @PostMapping("/evaluate")
    public ResponseEntity<Passenger> evaluate(@RequestBody AirlineRequest request) {
        Passenger result = airlineService.processAirlineRules(request);
        return ResponseEntity.ok(result);
    }
}