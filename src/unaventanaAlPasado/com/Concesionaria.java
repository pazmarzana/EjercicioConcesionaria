package unaventanaAlPasado.com;

import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {

	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static ArrayList<Vehiculo> listaOrdenada;
	
	public static void main(String[] args) {
		
		int aux;
		
		cargarVehiculos();
		mostrarVehiculos();
		mostrarSeparacion();
		
		mostrarMasCaro(retornarMasCaro());
		mostrarMasBarato(retornarMasBarato());
		aux = retornarPrimeroQueContieneLetra("Y");
		if(aux != -1) {
			mostrarPrimeroQueContieneLetra('Y', vehiculos.get(aux));
		}
		mostrarSeparacion();
		
		listaOrdenada = new ArrayList<Vehiculo>(vehiculos);
		Collections.sort(listaOrdenada, new OrdenPorPrecioDescendiente());
		mostrarOrdenadosPorPrecioDescendente(listaOrdenada);
        
	}//fin del main
	
	public static void cargarVehiculos() {
		vehiculos.add(new Auto("Peugeot", "206", 200000, 4));
		vehiculos.add(new Moto("Honda", "Titan", 60000, 125));
		vehiculos.add(new Auto("Peugeot", "208", 250000, 5));
		vehiculos.add(new Moto("Yamaha", "YBR", 80500.50f, 160));

	}
		
	public static Vehiculo retornarMasCaro() { 
		Vehiculo max = vehiculos.get(0);
        for (Vehiculo elemento : vehiculos) {
        	if(elemento.getPrecio() > max.getPrecio()) {
        		max = elemento;
        	}
         }
        return max; 
    } 
	
	public static Vehiculo retornarMasBarato() { 
		Vehiculo min = vehiculos.get(0);
        for (Vehiculo elemento : vehiculos) {
        	if(elemento.getPrecio() < min.getPrecio()) {
        		min = elemento;
        	}
         }
        return min; 
    }
	
	public static int retornarPrimeroQueContieneLetra(CharSequence letra) { 
        for (Vehiculo elemento : vehiculos) {
        	if(elemento.getModelo().contains(letra)) {
        		return vehiculos.indexOf(elemento); 
        	}
         }
        return -1;
    } 
	
	
	//metodos para imprimir/mostrar los datos
	
	public static void mostrarVehiculos() {
        for (Vehiculo elemento : vehiculos) {
            System.out.println(elemento);
        }
	}
	
	public static void mostrarSeparacion() { 
		System.out.println("=============================");
	}
	
	public static void mostrarMasCaro(Vehiculo vehiculo) { 
		System.out.println("Vehículo más caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    } 
	
	public static void mostrarMasBarato(Vehiculo vehiculo) { 
		System.out.println("Vehículo más barato: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    } 
			
	public static void mostrarPrimeroQueContieneLetra(char letra, Vehiculo vehiculo) { 
		System.out.println("Vehículo que contiene en el modelo la letra: '" + letra + "': " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + vehiculo.muestraPrecioFormateado());
    }
			
	public static void mostrarOrdenadosPorPrecioDescendente(ArrayList<Vehiculo> listaOrdenada) { 
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		for (int n = 0; n < listaOrdenada.size(); n++) {
			System.out.print(listaOrdenada.get(n).getMarca()+" "+listaOrdenada.get(n).getModelo()+"\n");
		}
    } 

}
