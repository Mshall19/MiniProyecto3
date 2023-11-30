package modelo;

import controlador.Ciudades;
import controlador.Partido;

public class Candidato extends Ciudadano{
    private String nombre;
    private String cedula;
    private String ciudad;
    private String posicion;
    private String partido;
    private int votos;
    private boolean derecha;
    private Partido partido_politico;
    private String propuestas;
    private int numero_votos;

    public Candidato(String nombre, String identificacion, Ciudades ciudad_origen, boolean derecha,
            Partido partido_politico, String propuestas) {
        super(nombre, identificacion, ciudad_origen);
        this.derecha = derecha;
        this.partido_politico = partido_politico;
        this.propuestas = propuestas;
        numero_votos = -1;
    }
    public boolean isDerecha() {
        return derecha;
    }
    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    public Partido getPartido_politico() {
        return partido_politico;
    }
    public void setPartido_politico(Partido partido_politico) {
        this.partido_politico = partido_politico;
    }
    
    public String getPropuestas() {
        return propuestas;
    }
    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }
    public int getNumero_votos() {
        return numero_votos;
    }
    public void setNumero_votos(int numero_votos) {
        this.numero_votos = numero_votos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public int getVotos() {
        return votos;
    }
    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nCédula: " + cedula +
                "\nCiudad: " + ciudad +
                "\nPosición: " + posicion +
                "\nPartido: " + partido +
                "\nVotos: " + votos +
                "\nPropuestas: " + propuestas;
    }
    
}
