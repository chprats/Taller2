package Logica.exception;

public class RegistroExcursionException extends Exception {
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public RegistroExcursionException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String darMensaje() {
		return mensaje;
	}

}