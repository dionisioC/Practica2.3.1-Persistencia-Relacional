package es.dionisiocortes.persistenciarelacional.models;

import lombok.Data;

@Data
public class Revision {
    private String avionRevisado;
    private String fechaInicio;
    private String fechaFin;
    private Long horasEmpleadas;
    private String mecanicoEncargado;
    private String tipoRevision;
    private String descripcion;
    private String aeropuerto;

}
