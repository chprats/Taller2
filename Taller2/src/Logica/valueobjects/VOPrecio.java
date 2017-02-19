package Logica.valueobjects;

public class VOPrecio {
	
	private double precio;
	
	
	public VOPrecio(){
		
	}
	
	public VOPrecio(double p){
		this.setPrecio(p);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
