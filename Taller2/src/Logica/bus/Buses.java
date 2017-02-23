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
		buses.put(objeto.getMatricula(), objeto); 
	}
	
	public void registrarBus (Bus b){
		
		buses.put(b.getMatricula(), b);
		
	}
	
	
	public Iterator<VOBus> listarbuses(){
		
		Bus busacambiar;
		TreeMap<String, VOBus> Busesaux = new TreeMap<String, VOBus>();
		VOBus remplazo;
		String mat, mar;
		int cant;
		Excursiones exc;
		exc = new Excursiones();
		
		Iterator<Bus> iter = buses.values().iterator();
			while(iter.hasNext()){
				busacambiar = iter.next();
				mat = busacambiar.getMatricula();
				mar = busacambiar.getMarca();
				cant = busacambiar.getCapacidad();
				exc = busacambiar.getExcursiones();
				remplazo = new VOBus(mat, mar, cant, exc);
				Busesaux.put(((VOMatricula)remplazo).getMatricula(), remplazo);
			}
		
		Iterator<VOBus> iterlisto = Busesaux.values().iterator();
		
		return iterlisto;
		
	}
}
