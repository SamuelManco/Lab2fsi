package com.udea.labdrools.service;

import com.udea.labdrools.model.AirlineRequest;
import com.udea.labdrools.model.Passenger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {

    @Autowired
    private KieContainer kieContainer;

    public Passenger processAirlineRules(AirlineRequest request) {
        KieSession kieSession = kieContainer.newKieSession();

        try {
            // Insertar los hechos recibidos en la memoria de Drools
            if (request.getPassenger() != null) kieSession.insert(request.getPassenger());
            if (request.getFlight() != null) kieSession.insert(request.getFlight());
            if (request.getLuggage() != null) kieSession.insert(request.getLuggage());
            if (request.getSeat() != null) kieSession.insert(request.getSeat());

            // Disparar las 10 reglas de la aerolínea
            kieSession.fireAllRules();

            // Retornar el pasajero actualizado con sus modificaciones y notas
            return request.getPassenger();
        } finally {
            kieSession.dispose();
        }
    }
}