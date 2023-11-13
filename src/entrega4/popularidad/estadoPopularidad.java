
package entrega4.popularidad;

import entrega4.cancion.Cancion;
import entrega4.icono.Icono;


public interface estadoPopularidad {
    
    Icono obtenerIcono();
    String obtenerLeyenda(Cancion cancion);
    
}
