package Logica.bus;

import java.util.TreeMap;

import Logica.excursion.Excursiones;
import Logica.valueobjects.*;

import java.util.Iterator;


public class Buses{
	
	/*protected TreeMap<String, VOBus> maTreeBuses;*/
	/*private TreeMap<String, VOBus> maTreeBuses; */

	protected TreeMap<String, Bus> buses;

	public Buses(){
		buses = new TreeMap<String, Bus>();
	}
	
	public void insert (Bus objeto){ 
		buses.put(((VOMatricula) objeto).getMatricula(), objeto); 
	}
	
	public void registrarBus (Bus b){
		
		String mat, mar;
		int cap;
		Excursiones exc = new Excursiones();
		b(mat,mar,cap, exc);
		buses.put(((VOMatricula) b).getMatricula(), b);
		
	}
	
	
	public Iterator<VOBus> listarbuses(){
		
		Iterator<VOBus> iter = buses.values().iterator();
		return iter;
		
		
	}
}
