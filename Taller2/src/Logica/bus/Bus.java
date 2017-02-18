package Logica.bus;

public class Bus {
	
	private  String matricula;
	private String marca;
	private int capacidad;
	
	public Bus(String matricula, String marca, int capacidad){
		
		this.matricula = matricula;
		this.marca = marca;
		this.capacidad = capacidad;
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	

}
