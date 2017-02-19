package Logica.valueobjects;
import java.util.Date;

public class VOExc {
	
	public String matricula;
	public Date horaSalida;
	public Date horaRegreso;
	public String destino;
	public double precio;
	
	public VOExc(){
		
	}
	
	public VOExc(String mat, Date hs, Date hr, String dest, double p){
		this.matricula = mat;
		this.horaSalida = hs;
		this.horaRegreso = hr;
		this.destino = dest;
		this.precio = p;
		
	}
}
