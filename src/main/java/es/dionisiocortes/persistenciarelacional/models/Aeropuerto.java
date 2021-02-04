package es.dionisiocortes.persistenciarelacional.models;

import lombok.Data;

@Data
public class Aeropuerto {

    private String codigoIata;
    private String nombre;
    private String ciudad;
    private String pais;

}
