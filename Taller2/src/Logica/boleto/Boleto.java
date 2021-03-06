package Logica.boleto;

import java.io.Serializable;

public class Boleto implements Serializable{
	
	private int nroBoleto;
	private int edad;
	private String lugar;
	private String celular;
		
public Boleto(int nroBoleto, int edad, String lugar, String celular){
		
		this.nroBoleto = nroBoleto;
		this.edad = edad;
		this.lugar = lugar;
		this.celular = celular;
		
	}
	
	public int getNroBoleto() {
		return nroBoleto;
	}
	public void setNroBoleto(int nroBoleto) {
		this.nroBoleto = nroBoleto;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

}
