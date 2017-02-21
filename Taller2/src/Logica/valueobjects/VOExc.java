package Logica.valueobjects;
import java.util.Date;

public class VOExc {
	
	private String codigo;
	private Date horaSalida;
	private Date horaRegreso;
	private String destino;
	private double precio;
	
	public VOExc(){
		
	}
	
	public VOExc(String cod, Date hs, Date hr, String dest, double p){
		this.setCodigo(cod);
		this.setHoraSalida(hs);
		this.setHoraRegreso(hr);
		this.setDestino(dest);
		this.setPrecio(p);
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String cod) {
		this.codigo = cod;
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
