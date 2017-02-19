package Logica.valueobjects;
import java.util.Date;

public class VOExc {
	
	private String matricula;
	private Date horaSalida;
	private Date horaRegreso;
	private String destino;
	private double precio;
	
	public VOExc(){
		
	}
	
	public VOExc(String mat, Date hs, Date hr, String dest, double p){
		this.setMatricula(mat);
		this.setHoraSalida(hs);
		this.setHoraRegreso(hr);
		this.setDestino(dest);
		this.setPrecio(p);
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraRegreso() {
		return horaRegreso;
	}

	public void setHoraRegreso(Date horaRegreso) {
		this.horaRegreso = horaRegreso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
