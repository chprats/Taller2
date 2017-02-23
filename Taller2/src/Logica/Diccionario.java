package Logica;
import Logica.valueobjects.*;
import java.util.TreeMap;



public class Diccionario {
	
	protected TreeMap<String, VOBus> diccio;

	public Diccionario(){
		diccio = new TreeMap<String, VOBus>();
	}
	
	public boolean member (String clave){ 
		return diccio.containsKey(clave); 
	}
	
	public VOBus find (String clave){ 
		return diccio.get(clave); 
	}
	
	public void insert (String clave, VOBus objeto){ 
		diccio.put(clave,objeto); 
	}
	
	public void delete (String clave){ 
		diccio.remove(clave);
	}

}
