package Logica.exception;

public class VentaBoletoException extends Exception {
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public VentaBoletoException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String darMensaje() {
		return mensaje;
	}

}