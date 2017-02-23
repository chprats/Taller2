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
		
		buses.registrarBus(b);
		
	}
	
	public Iterator<VOBus> ListarBuses(){
		
		Iterator iter;
		iter = buses.listarbuses();
		return iter;
		
	}
	
	
	
	

}
