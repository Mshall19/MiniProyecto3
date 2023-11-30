package modelo;

import controlador.Ciudades;
import controlador.Partido;

public class Candidato extends Ciudadano{
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
}
