package Logica.bus;
import Logica.excursion.*;
import Logica.valueobjects.VOBus;

public class Bus {
	
	private  String matricula;
	private String marca;
	private int capacidad;
	private Excursiones excursiones;
	
	public Bus(String matricula, String marca, int capacidad, Excursiones exc){
		
		this.matricula = matricula;
		this.marca = marca;
		this.capacidad = capacidad;
		this.setExcursiones(exc);
		
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

	public Bus VOaO (VOBus b){
		
		String mat, mar;
		int cap;
		Excursiones exc = new Excursiones();
		Bus busnuevo;
		busnuevo = Bus(mat,mar,cap, exc);
		return busnuevo;
		
	}

}
