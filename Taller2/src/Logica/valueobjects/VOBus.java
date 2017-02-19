package Logica.valueobjects;

public class VOBus extends VOMatricula{
	
	public String marca;
	public int capacidad;
	public int cantexcu;
	
	public VOBus(){
	}
	
	public VOBus(String mat, String mar, int cap, int cantexc){
		super(mat);
		this.marca = mar;
		this.capacidad = cap;
		this.cantexcu = cantexc;
	}

}
