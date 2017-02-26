package Logica.boleto;
import java.io.Serializable;
import java.util.*;


public class Boletos implements Serializable {
	
	private ArrayList<Boleto>  arreLiBoletos = new ArrayList<Boleto>();

	public ArrayList<Boleto> getArreLiBus() {
		return arreLiBoletos;
	}

	public void setArreLiBus(ArrayList<Boleto> arreLiBoletos) {
		this.arreLiBoletos = arreLiBoletos;
	}

	

}