package Logica.bus;
import java.io.Serializable;

import Logica.excursion.*;

public class Bus implements Serializable {
	
	private  String matricula;
	private String marca;
	private int capacidad;
	private Excursiones excursiones;
	
	
	
	
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String matricula, String marca, int capacidad){
		
		this.matricula = matricula;
		this.marca = marca;
		this.capacidad = capacidad;
		
	}

	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
		return excursiones;
	}

	public void setExcursiones(Excursiones excursiones) {
		this.excursiones = excursiones;
	}
	

}
