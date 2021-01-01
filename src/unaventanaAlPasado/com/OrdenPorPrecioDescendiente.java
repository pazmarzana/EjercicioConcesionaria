package unaventanaAlPasado.com;

import java.util.Comparator;

public class OrdenPorPrecioDescendiente implements Comparator<Vehiculo> {

    public int compare(Vehiculo a, Vehiculo b) 
    { 
        int comparaPrecio = Float.compare(a.getPrecio(), b.getPrecio());
        if(comparaPrecio != 0) {
        	return -comparaPrecio;
        }else{
        	int comparaMarca = a.getMarca().compareTo(b.getMarca());
            if(comparaMarca != 0) {
            	return comparaMarca;
	        }else{
  	        	int comparaModelo = a.getModelo().compareTo(b.getModelo());
	        	return comparaModelo;
	        }
        }
    } 
 
}
