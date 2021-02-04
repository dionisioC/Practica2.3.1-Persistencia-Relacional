package es.dionisiocortes.persistenciarelacional.models;

import lombok.Data;

@Data
public class Mecanico {
    private String codigoEmpleado;
    private String nombre;
    private String apellidos;
    private String empresa;
    private Integer anioIncorporacion;
    private String formacionPrevia;

}
