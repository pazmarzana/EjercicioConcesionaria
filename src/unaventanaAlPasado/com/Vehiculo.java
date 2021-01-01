package unaventanaAlPasado.com;

public class Vehiculo {
	private String marca;
	private String modelo;
	private float precio;

	public Vehiculo() {
	}
	
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	String getMarca() {
		return marca;
	}

	String getModelo() {
		return modelo;
	}

	float getPrecio() {
		return precio;
	}
	
	String muestraPrecioFormateado() { 
        return "$"+ String.format(java.util.Locale.ITALY,"%,.2f", this.getPrecio() ); 
    } 
	
	public String toString() { 
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Precio: "+ this.muestraPrecioFormateado(); 
    }

}
