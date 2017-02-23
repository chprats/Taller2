package Persistencia;

import java.io.*;

public class Respaldo {
	
	
	
	public void respaldar (String ArchivoRespaldo, Guardar guardar) throws IOException {
		
		
		FileOutputStream f = new FileOutputStream(ArchivoRespaldo);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject (guardar);
		o.close();
		f.close();
		
		
	}

	/*public Guardar recuerde(String ArchivoRespaldo){}	*/
	
	
}
