package Logica;

import Logica.bus.*;
import Logica.valueobjects.*;

public class Fachada {
	
	
	private Buses buses;
    /*private Excursiones excurciones;*/
	
	public Fachada(){
		super();
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
