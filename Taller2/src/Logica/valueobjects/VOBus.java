package Logica.valueobjects;

import Logica.excursion.Excursiones;

public class VOBus extends VOMatricula{
	
	private String marca;
	private int capacidad;
	private Excursiones exc;
	
	public VOBus(){
	}
	
	public VOBus(String mat, String mar, int cap, Excursiones exc){
		super(mat);
		this.setMarca(mar);
		this.setCapacidad(cap);
		this.setExcursiones(exc);
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

	public Excursiones getExcursiones() {
		return exc;
	}

	public void setExcursiones(Excursiones excursiones) {
		this.exc = excursiones;
	}

}
