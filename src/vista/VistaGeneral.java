package vista;

import controlador.Ciudades;
import controlador.Partido;

public interface VistaGeneral {
    
    public void Iniciar();
    public String getNombre();
    public String getIdentificacion();
    public Ciudades getCiudadOrigen();
    public boolean IsDerecha();
    public Partido getPartido();
    public String getPropuestas();

}