
package entrega4;

import entrega4.cancion.Cancion;



public class Entrega4 {


    public static void main(String[] args) {
    
               
        
    Cancion c1 = new Cancion("The Scientist","Coldplay","A Rush of Blood to the head",2002);
        
    c1.reproducirCancion();
    
    c1.setCantidadReproducciones(600000);
    
    c1.reproducirCancion();
    
    c1.setCantidadDislikes(100000);
  
    c1.reproducirCancion();
        
    c1.setReproducida24hrs(false);
    
    c1.reproducirCancion();
   
    }
    
}
