package Logica;

import Logica.bus.*;
import Logica.excursion.*;
import Logica.valueobjects.*;


public class Fachada {
	
	private Buses buses;
    private Excursiones excursiones;
	
	private Fachada(){
		buses = new 
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
	
	
	
	

}
