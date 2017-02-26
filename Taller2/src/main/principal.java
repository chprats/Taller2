package main;

import java.io.IOException;
import java.util.Iterator;

import Logica.Fachada;
import Logica.bus.*;
import Logica.exception.PersistenciaException;
import Logica.excursion.Excursiones;
import Logica.valueobjects.*;
import persistencia.Guardar;
import persistencia.Respaldo;

public class principal {
	
//Prueba requerimiento 1	
	public static void main (String[] args) /*throws PersistenciaException*/{
	
	Fachada f;
	f = new Fachada();
    Buses pruebas;
    pruebas = new Buses(); 
	VOBus prueba;
	Excursiones exc;
	exc = new Excursiones();
	
	/*prueba = new VOBus("1", "Volvo", 20, exc);
	f.Registrarbus(prueba);
	//pruebas.registrarBus(prueba);
	prueba = new VOBus("4", "ASDasd", 30, exc);
	f.Registrarbus(prueba);
	//pruebas.registrarBus(prueba);
	prueba = new VOBus("8", "aspdasd", 23, exc);
	f.Registrarbus(prueba);
	//pruebas.registrarBus(prueba);
	prueba = new VOBus("2", "asdxa2", 21, exc);
	f.Registrarbus(prueba);*/
	//pruebas.registrarBus(prueba);
	String mensaje;
	
	
	//Probar GUARDAR ARCHIVO
	/*try {
		f.guardarDato();
	} catch (PersistenciaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	
	//Probar RECUPERAR DESDE ARCHIVO
	try {
		f.recuperarDatos();
	} catch (PersistenciaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//Prueba requerimiento 2
	Iterator<VOBus> iterb = f.ListarBuses();
		while(iterb.hasNext()){
			prueba = iterb.next();
			Excursiones excaux;
			excaux = prueba.getExcursiones();
			mensaje = "Matricula: " + (prueba).getMatricula();
			System.out.println(mensaje);
			mensaje = "Marca: " + prueba.getMarca();
			System.out.println(mensaje);
			mensaje = "Capacidad: " + prueba.getCapacidad();
			System.out.println(mensaje);
			//mensaje = "Cantidad de excursiones asignadas: " + exc;
			//System.out.println(mensaje);
			System.out.println("*************************************");
		}
	
	
		
		/*String ArchivoRespaldo = "ArchivoRespaldo2";
		Excursiones excu = new Excursiones();
		Guardar guar = new Guardar(excu,pruebas);
		Respaldo re = new Respaldo();*/
		//re.respaldar(ArchivoRespaldo, guar);
		
		
		
		
	}
	
	
	
	
	

}