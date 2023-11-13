
package entrega4.popularidad;

import entrega4.cancion.Cancion;
import entrega4.icono.Icono;


public class PopularidadAuge implements estadoPopularidad{

    @Override
    public Icono obtenerIcono() {

        return Icono.ROCKET;
    }

    @Override
    public String obtenerLeyenda(Cancion cancion) {
        
            return cancion.getNombreArtista() + " - "  + cancion.getTituloCancion() + "( " + cancion.getNombreAlbum() + " - " + cancion.getAnioAlbum()+ " )";
    }
    
}
