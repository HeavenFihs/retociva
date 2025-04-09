package com.example.retoc.retociva.DTO;

public class BusRequestDTO {
    private String numeroBus;
    private String placa;
    private String caracteristicas;
    private Boolean estado;
    private Long marcaId;

    // Getters y setters

    public String getNumeroBus() {return numeroBus;}

    public void setNumeroBus(String numeroBus) {this.numeroBus = numeroBus;}

    public String getPlaca() {return placa;}

    public void setPlaca(String placa) {this.placa = placa;}

    public String getCaracteristicas() {return caracteristicas;}

    public void setCaracteristicas(String caracteristicas) {this.caracteristicas = caracteristicas;}

    public Boolean getEstado() {return estado;}

    public void setEstado(Boolean estado) {this.estado = estado;}

    public Long getMarcaId() {return marcaId;}

    public void setMarcaId(Long marcaId) {this.marcaId = marcaId;}
}
