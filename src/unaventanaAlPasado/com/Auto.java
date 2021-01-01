package unaventanaAlPasado.com;

public class Auto extends Vehiculo {
	private int cantidadPuertas;

	public Auto() {
	}
	
	public Auto(String marca, String modelo, float precio, int cantidadPuertas) {
		super(marca, modelo, precio);
		this.cantidadPuertas = cantidadPuertas;
	}
	
	int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public String toString() { 
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Puertas: "+this.cantidadPuertas + " // " + "Precio: "+ this.muestraPrecioFormateado(); 
    } 
	
}
