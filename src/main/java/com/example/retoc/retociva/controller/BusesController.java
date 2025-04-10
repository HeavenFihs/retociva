package com.example.retoc.retociva.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.retoc.retociva.DTO.BusDTO;
import com.example.retoc.retociva.DTO.BusRequestDTO;
import com.example.retoc.retociva.model.Bus;
import com.example.retoc.retociva.model.MarcaBus;
import com.example.retoc.retociva.repository.BusRepository;
import com.example.retoc.retociva.repository.MarcaBusRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/bus")
public class BusesController {

    @Autowired
    private BusRepository busRepository;

    // @Autowired
    // private MarcaBusRepository marcaBusRepository;

    public BusesController(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    // GET -- lista de todos los buses
    // @GetMapping
    // public List<BusDTO> getAllBuses() {
    //     return busRepository.findAll().stream()
    //         .map(BusDTO::new)
    //         .toList();
    // }

    @GetMapping
    public Page<BusDTO> getBusesPaginados(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return busRepository.findAll(pageable).map(BusDTO::new);
    }

    // GET -- información de un bus específico
    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> getBusById(@PathVariable Long id) {
        return busRepository.findById(id)
            .map(bus -> ResponseEntity.ok(new BusDTO(bus)))
            .orElse(ResponseEntity.notFound().build());
    }

    // @PostMapping
    // public ResponseEntity<String> crearBus(@RequestBody BusRequestDTO dto) {
    //     Optional<MarcaBus> marcaOpt = marcaBusRepository.findById(dto.getMarcaId());
    //     if (marcaOpt.isEmpty()) {
    //         return ResponseEntity.badRequest().body("Marca no encontrada con ID: " + dto.getMarcaId());
    //     }

    //     Bus bus = new Bus();
    //     bus.setNumeroBus(dto.getNumeroBus());
    //     bus.setPlaca(dto.getPlaca());
    //     bus.setCaracteristicas(dto.getCaracteristicas());
    //     bus.setEstado(dto.getEstado());
    //     bus.setMarca(marcaOpt.get());

    //     busRepository.save(bus);
    //     return ResponseEntity.ok("Bus registrado correctamente con ID: " + bus.getId());
    // }
}
