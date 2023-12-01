package modelo;

import controlador.Ciudades;

public class Ciudadano {
    private String nombre;
    private String identificacion;
    private Ciudades ciudad_origen;

    public Ciudadano(String nombre, String identificacion, Ciudades ciudad_origen) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.ciudad_origen = ciudad_origen;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Ciudades getCiudad_origen() {
        return ciudad_origen;
    }
    public void setCiudad_origen(Ciudades ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

}
