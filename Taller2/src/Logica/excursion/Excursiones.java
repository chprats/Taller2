package Logica.excursion;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeMap;

import Logica.valueobjects.VOBus;
import Logica.valueobjects.VOExc;
import Logica.valueobjects.VOMatricula;

public class Excursiones implements Serializable{
	protected TreeMap<String, VOExc> excursiones;

	public Excursiones(){
		excursiones = new TreeMap<String, VOExc>();
	}

	public void insert (VOExc objeto){ 
		excursiones.put(objeto.getCodigo(), objeto); 
	}
	
	public void quitarExcursion(VOExc objeto){
		excursiones.remove(objeto.getCodigo());
	
	}
	
	public boolean member(VOExc exc)
	{
		return excursiones.containsKey(exc.getCodigo());
	}
	
	public Iterator<VOExc> listarExcursiones(){
		
		Iterator<VOExc> iter = excursiones.values().iterator();
		return iter;
	}
	
}
