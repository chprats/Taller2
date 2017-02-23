package Logica;

import java.util.Iterator;

import Logica.bus.*;
import Logica.excursion.*;
import Logica.valueobjects.*;

public class Fachada {
	
	private Buses buses;
    private Excursiones excursiones;
	
	public Fachada(){
		buses = new Buses();
		excursiones = new Excursiones();
	}

	public Buses getBuses() {
		return buses;
	}

	public void setBuses(Buses buses) {
		this.buses = buses;
	}
	
	public void Registrarbus(VOBus b){
		
		String mat, mar;
		int cap;
		Excursiones exc = new Excursiones();
		mat = b.getMatricula();
		mar = b.getMarca();
		cap = b.getCapacidad();
		Bus busnuevo;
		busnuevo = new Bus(mat,mar,cap, exc);
		buses.registrarBus(busnuevo);
		
	}
	
	public Iterator<VOBus> ListarBuses(){
		
		Iterator<VOBus> iter;
		iter = buses.listarbuses();
		return iter;
		
	}
	
	
	
	

}
