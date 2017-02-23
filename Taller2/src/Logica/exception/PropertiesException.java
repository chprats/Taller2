package Logica.exception;

public class PropertiesException extends Exception{
	

	private static final long serialVersionUID = 1L;
	private String mensaje;

	public PropertiesException(String mensaje) {
		this.mensaje = mensaje;
	}

	public String darMensaje() {
		return mensaje;
	}

}
