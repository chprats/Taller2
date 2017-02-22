package Logica.exception;

public class RegistroBusException extends Exception {
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public RegistroBusException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String darMensaje() {
		return mensaje;
	}

}