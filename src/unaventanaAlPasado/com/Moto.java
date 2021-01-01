package unaventanaAlPasado.com;

public class Moto extends Vehiculo {
	private int cilindrada;

	public Moto() {
	}
	
	public Moto(String marca, String modelo, float precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	int getCilindrada() {
		return cilindrada;
	}
	
	public String toString() { 
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Cilindrada: "+this.cilindrada + "cc" + " // " + "Precio: "+ this.muestraPrecioFormateado(); 
    } 
}
