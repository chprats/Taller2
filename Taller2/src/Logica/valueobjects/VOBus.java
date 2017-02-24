package Logica.valueobjects;

import java.io.Serializable;

public class VOBus extends VOMatricula implements Serializable{
	
	private String marca;
	private int capacidad;
	private int cantexcu;
	
	public VOBus(){
	}
	
	public VOBus(String mat, String mar, int cap, int cantexc){
		super(mat);
		this.setMarca(mar);
		this.setCapacidad(cap);
		this.setCantexcu(cantexc);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCantexcu() {
		return cantexcu;
	}

	public void setCantexcu(int cantexcu) {
		this.cantexcu = cantexcu;
	}

}
