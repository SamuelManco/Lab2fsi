package com.udea.labdrools.controller;

import com.udea.labdrools.model.*;
import com.udea.labdrools.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/airline")
public class ViewController {

    @Autowired
    private AirlineService airlineService;

    // Cargar la página con el formulario vacío
    @GetMapping("/form")
    public String showForm(Model model) {
        AirlineRequest request = new AirlineRequest();
        request.setPassenger(new Passenger());
        request.setFlight(new Flight());
        request.setLuggage(new Luggage());
        request.setSeat(new Seat());

        // Sincronizar membresía del pasajero
        request.getPassenger().setMembership("Basic");
        request.getPassenger().setStatus("Basic");

        model.addAttribute("airlineRequest", request);
        return "airlineForm";
    }

    // Procesar el formulario con Drools y mostrar el resultado en la misma vista
    @PostMapping("/form")
    public String processForm(@ModelAttribute("airlineRequest") AirlineRequest request, Model model) {
        // Asignar el ID de pasajero al equipaje para la correlación de Drools
        if (request.getLuggage() != null && request.getPassenger() != null) {
            request.getLuggage().setPassengerId(request.getPassenger().getPassengerId());
        }

        // Asignar el status a membership si aplica
        if (request.getPassenger() != null) {
            request.getPassenger().setMembership(request.getPassenger().getStatus());
        }

        Passenger result = airlineService.processAirlineRules(request);
        model.addAttribute("result", result);
        return "airlineForm";
    }
}