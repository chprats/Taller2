package Logica.excursion;

import java.io.Serializable;
import java.util.TreeMap;

import Logica.valueobjects.VOExc;

public class Excursiones implements Serializable{
	
	protected TreeMap<String, VOExc> excursiones;
	
	public Excursiones(){
		excursiones = new TreeMap<String, VOExc>();
	}
	
	
}
