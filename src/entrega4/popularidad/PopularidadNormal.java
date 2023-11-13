
package entrega4.popularidad;

import entrega4.cancion.Cancion;
import entrega4.icono.Icono;


public class PopularidadNormal implements estadoPopularidad{

    @Override
    public Icono obtenerIcono() {
        
       return Icono.MUSICAL_NOTE;
    }

    @Override
    public String obtenerLeyenda(Cancion cancion) {
        
           return cancion.getNombreArtista() + " - " + cancion.getNombreAlbum() + " - " + cancion.getTituloCancion();

    }    
    
}
