
public class Especial extends Boleto {
	
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
