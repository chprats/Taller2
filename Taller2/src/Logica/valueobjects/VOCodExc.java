package Logica.valueobjects;

public class VOCodExc {

	private String codigo;
	
	public VOCodExc(){
		
	}
	
	public VOCodExc(String cod){
		this.setCodigo(cod);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
