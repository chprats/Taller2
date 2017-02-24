package Logica.bus;

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeMap;

import Logica.Diccionario;
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
	
	public boolean member(VOBus bus)
	{
		return buses.containsKey(bus.getMatricula());
	}
	
	public void reasignarBus(VOBus bus, VOExc exc){
		
		if( this.member(bus))
		{
			Bus b = new Bus(bus.getMatricula(), bus.getMarca(), bus.getCapacidad());
			if (b.getExcursiones().member(exc)){
				b.getExcursiones().quitarExcursion(exc);
				
				Collection dic = buses.values();
				Iterator itr = dic.iterator();
				
				while(itr.hasNext()){
					Bus aux = (Bus)itr.next();
					int capacidad = aux.getCapacidad();
					int boletosVendidos = exc.getBoletosVendidos();
					if(capacidad>boletosVendidos){
						aux.getExcursiones().insert(exc);
						dic.remove(aux);
						dic.add(aux);
						break;
						
					}
						
						
				}
					
				
			
			}
					
			
		}
	}
	
	public Iterator<VOBus> listarbuses(){
		
		Iterator<VOBus> iter = buses.values().iterator();
		return iter;
		
		
	}
}
