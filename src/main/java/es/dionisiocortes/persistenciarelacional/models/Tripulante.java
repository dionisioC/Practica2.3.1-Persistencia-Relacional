package es.dionisiocortes.persistenciarelacional.models;

import lombok.Data;

@Data
public class Tripulante {
    private String codigoEmpleado;
    private String nombre;
    private String apellidos;
    private String puesto;
    private String compania;
}
