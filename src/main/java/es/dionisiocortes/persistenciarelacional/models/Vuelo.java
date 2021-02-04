package es.dionisiocortes.persistenciarelacional.models;

import lombok.Data;

import java.util.List;

@Data
public class Vuelo {
    private String codigoVuelo;
    private String compania;
    private String avion;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private String fechaYHoraDeSalida;
    private Float duracionDelVuelo;
    private List<Tripulante> tripulantes;
}
