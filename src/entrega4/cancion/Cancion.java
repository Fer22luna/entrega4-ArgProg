package entrega4.cancion;

import entrega4.icono.Icono;
import entrega4.popularidad.PopularidadAuge;
import entrega4.popularidad.PopularidadNormal;
import entrega4.popularidad.PopularidadTendencia;
import entrega4.popularidad.estadoPopularidad;

public class Cancion {

    
    private String tituloCancion;
    private String nombreArtista;
    private String NombreAlbum;
    private Integer anioAlbum;
    private Integer cantidadLikes;
    private Integer cantidadDislikes;
    private Integer cantidadReproducciones;
    private boolean reproducida24hrs;
    private estadoPopularidad popularidad;

    
    public Cancion() {

    }

    public Cancion(String tituloCancion, String nombreArtista, String NombreAlbum, Integer anioAlbum) {
        this.tituloCancion = tituloCancion;
        this.nombreArtista = nombreArtista;
        this.NombreAlbum = NombreAlbum;
        this.anioAlbum = anioAlbum;
        this.cantidadLikes = 0;
        this.cantidadDislikes = 0;
        this.cantidadReproducciones = 0;
        this.popularidad = new PopularidadNormal();
        this.reproducida24hrs = true;
    }
    
 
    // Bueno aca me gustaria hacer una clase servicio para que las canciones no se reproduzcan 
    // a ellas misma sino que delegar esa responsabilidad a otra clase.
    public void reproducirCancion(){
        
        if (this.cantidadDislikes > 5000 ) {
            setPopularidad(new PopularidadNormal());
        } else if (this.cantidadReproducciones<1000) {
            setPopularidad(new PopularidadNormal());
        } else if (this.cantidadReproducciones> 1000) {
            setPopularidad(new PopularidadAuge());
        } else if (this.cantidadReproducciones > 50000 && this.cantidadLikes > 20000) {
            setPopularidad(new PopularidadTendencia());
        } else if (this.reproducida24hrs == false){
            setPopularidad(new PopularidadNormal());
        }
        
        mostrarIconoLeyenda();
        
    }
    
    public void mostrarIconoLeyenda(){
        
        Icono icono = popularidad.obtenerIcono();
        String leyenda = popularidad.obtenerLeyenda(this);
        
  
        System.out.println(icono.texto());
        System.out.println(leyenda);
        
    }
   

    public String getTituloCancion() {
        return tituloCancion;
    }

    public estadoPopularidad getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(estadoPopularidad popularidad) {
        this.popularidad = popularidad;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getNombreAlbum() {
        return NombreAlbum;
    }

    public void setNombreAlbum(String NombreAlbum) {
        this.NombreAlbum = NombreAlbum;
    }

    public Integer getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(Integer anioAlbum) {
        this.anioAlbum = anioAlbum;
    }

    public Integer getCantidadLikes() {
        return cantidadLikes;
    }

    public void setCantidadLikes(Integer cantidadLikes) {
        this.cantidadLikes = cantidadLikes;
    }

    public Integer getCantidadDislikes() {
        return cantidadDislikes;
    }

    public void setCantidadDislikes(Integer cantidadDislikes) {
        this.cantidadDislikes = cantidadDislikes;
    }

    public Integer getCantidadReproducciones() {
        return cantidadReproducciones;
    }

    public void setCantidadReproducciones(Integer cantidadReproducciones) {
        this.cantidadReproducciones = cantidadReproducciones;
    }

    public boolean isReproducida24hrs() {
        return reproducida24hrs;
    }

    public void setReproducida24hrs(boolean reproducida24hrs) {
        this.reproducida24hrs = reproducida24hrs;
    }
    

    
}
