package Logica.bus;

import java.io.Serializable;
import java.util.TreeMap;

import Logica.valueobjects.*;

import java.util.Iterator;


public class Buses implements Serializable{
	
	/*protected TreeMap<String, VOBus> maTreeBuses;*/
	/*private TreeMap<String, VOBus> maTreeBuses; */

	protected TreeMap<String, VOBus> buses;

	public Buses(){
		buses = new TreeMap<String, VOBus>();
	}
	
	public void insert (VOBus objeto){ 
		buses.put(((VOMatricula) objeto).getMatricula(), objeto); 
	}
	
	public void registrarBus (VOBus b){
		
		buses.put(((VOMatricula) b).getMatricula(), b);
		
	}
	
	
	public Iterator<VOBus> listarbuses(){
		
		Iterator<VOBus> iter = buses.values().iterator();
		return iter;
		
		
	}
}
