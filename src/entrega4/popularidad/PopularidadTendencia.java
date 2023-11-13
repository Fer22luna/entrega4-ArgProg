
package entrega4.popularidad;

import entrega4.cancion.Cancion;
import entrega4.icono.Icono;


public class PopularidadTendencia implements estadoPopularidad{

    @Override
    public Icono obtenerIcono() {
        return Icono.FIRE;
    }

    @Override
    public String obtenerLeyenda(Cancion cancion) {


      return cancion.getTituloCancion() + " - "  +  cancion.getNombreArtista() + "( " + cancion.getNombreAlbum() + " - " + cancion.getAnioAlbum()+ " )";

    }
    
}
    