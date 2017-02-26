package Logica.boleto;

import java.io.Serializable;




public class Especial extends Boleto implements Serializable{
	
	private float descuento;
	
	public Especial(int nroBoleto, int edad, String lugar, String celular, float descuento){
		super(nroBoleto,edad,lugar,celular);
		this.descuento = descuento;		
	
	}
				
	
	
	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	

}
