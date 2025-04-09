package com.example.retoc.retociva.DTO;

import java.time.LocalDateTime;

import com.example.retoc.retociva.model.Bus;

public class BusDTO {
    private Long id;
    private String numeroBus;
    private String placa;
    private LocalDateTime fechaCreacion;
    private String caracteristicas;
    private Boolean estado;
    private String marca;

    public BusDTO(Bus bus) {
        this.id = bus.getId();
        this.numeroBus = bus.getNumeroBus();
        this.placa = bus.getPlaca();
        this.fechaCreacion = bus.getFechaCreacion();
        this.caracteristicas = bus.getCaracteristicas();
        this.estado = bus.getEstado();
        this.marca = bus.getMarca().getNombre(); 
    }

    // Getters

    public Long getId() {return id;}

    public String getNumeroBus() {return numeroBus;}

    public String getPlaca() {return placa;}

    public LocalDateTime getFechaCreacion() {return fechaCreacion;}

    public String getCaracteristicas() {return caracteristicas;}

    public Boolean getEstado() {return estado;}

    public String getMarca() {return marca;}
}
