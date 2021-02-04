package es.dionisiocortes.persistenciarelacional.models;

import lombok.Data;

@Data
public class Avion {
    private String matricula;
    private String fabricante;
    private String modelo;
    private long horasDeVuelo;
}
