package com.example.retoc.retociva.model;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroBus;
    private String placa;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    private String caracteristicas;
    private Boolean estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_marca")
    private MarcaBus marca;

    // Getters y setters
    // just for a matter of habit

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNumeroBus() {return numeroBus;}

    public void setNumeroBus(String numeroBus) {this.numeroBus = numeroBus;}

    public String getPlaca() {return placa;}

    public void setPlaca(String placa) {this.placa = placa;}

    public LocalDateTime getFechaCreacion() {return fechaCreacion;}

    public void setFechaCreacion(LocalDateTime fechaCreacion) {this.fechaCreacion = fechaCreacion;}

    public String getCaracteristicas() {return caracteristicas;}

    public void setCaracteristicas(String caracteristicas) {this.caracteristicas = caracteristicas;}

    public Boolean getEstado() {return estado;}

    public void setEstado(Boolean estado) {this.estado = estado;}
    
    public MarcaBus getMarca() {return marca;}

    public void setMarca(MarcaBus marca) {this.marca = marca;}
}