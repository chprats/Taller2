package main;

import java.util.Iterator;

import Logica.bus.*;
import Logica.valueobjects.*;

public class principal {
	
//Prueba requerimiento 1	
	public static void main(String[] args){
	
    Buses pruebas;
    pruebas = new Buses(); 
	VOBus prueba;
	
	prueba = new VOBus("1", "Volvo", 20, 4);
	pruebas.registrarBus(prueba);
	prueba = new VOBus("4", "ASDasd", 30, 2);
	pruebas.registrarBus(prueba);
	prueba = new VOBus("8", "aspdasd", 23, 5);
	pruebas.registrarBus(prueba);
	prueba = new VOBus("2", "asdxa2", 21, 1);
	pruebas.registrarBus(prueba);
	String mensaje;
	
//Prueba requerimiento 2
	Iterator<VOBus> iterb = pruebas.listarbuses();
		while(iterb.hasNext()){
			prueba = iterb.next();
			mensaje = "Matricula: " + ((VOMatricula)prueba).getMatricula();
			System.out.println(mensaje);
			mensaje = "Marca: " + prueba.getMarca();
			System.out.println(mensaje);
			mensaje = "Capacidad: " + prueba.getCapacidad();
			System.out.println(mensaje);
			mensaje = "Cantidad de excursiones asignadas: " + prueba.getCantexcu();
			System.out.println(mensaje);
			System.out.println("*************************************");
		}
	
	
	}

}
