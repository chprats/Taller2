package Logica.excursion;
import java.io.Serializable;
import java.util.Date;



public class Excursion implements Serializable {
	
	private String codigo;
	private String destino;
	private Date horaSalida;
	private Date horaEntrada;
	private float precioBase;
	
	
	public Excursion(String codigo, String destino, Date horaSalida, Date horaEntrada, float precioBase){
		
		this.codigo = codigo;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaEntrada = horaEntrada;
		this.precioBase = precioBase;
		
			
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	
	
	
	

}
