package com.example.retoc.retociva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.retoc.retociva.model.Bus;
import com.example.retoc.retociva.repository.BusRepository;

@RestController
@RequestMapping("/bus")
public class BusesController {

    private final BusRepository busRepository;

    public BusesController(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    // GET -- lista de todos los buses
    @GetMapping
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    // GET -- información de un bus específico
    @GetMapping("/{id}")
    public Optional<Bus> getBusById(@PathVariable Long id) {
        return busRepository.findById(id);
    }
}
