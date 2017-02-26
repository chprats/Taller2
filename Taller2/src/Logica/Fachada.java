package Logica;

import java.util.Iterator;

import persistencia.Guardar;
import persistencia.Respaldo;
import Logica.bus.*;
import Logica.exception.PersistenciaException;
import Logica.excursion.*;
import Logica.valueobjects.*;

public class Fachada {
	
	private Buses buses;
    private Excursiones excursiones;
	
	public Fachada(){
		buses = new Buses();
		setExcursiones(new Excursiones());
	}

	public Buses getBuses() {
		return buses;
	}

	public void setBuses(Buses buses) {
		this.buses = buses;
	}
	public Excursiones getExcursiones() {
		return excursiones;
	}

	public void setExcursiones(Excursiones excursiones) {
		this.excursiones = excursiones;
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
	
	public void recuperarDatos() throws PersistenciaException, Throwable{
		
		
		Respaldo res = new Respaldo();				
		Guardar guar = res.recuerde("ArchivoRespaldo9.txt");
		this.buses = guar.getBusesGuar();
		this.setExcursiones(guar.getExcuGuar());
		
		String mensaje;
		mensaje = "Levanto METODO ";
		System.out.println(mensaje);
		
		
		
	}

	
	
	public void guardarDato () throws PersistenciaException {
		
Guardar guar = new Guardar(getExcursiones(), getBuses());

guar.respaldarDatos();
		
	
	}
	

}
