package persistencia;

import java.io.*;

import Logica.bus.Buses;
import Logica.exception.PersistenciaException;

public class Respaldo {
	
	
	
	public void respaldar (String ArchivoRespaldo, Guardar guardar) throws PersistenciaException {
		
		try{
		FileOutputStream f = new FileOutputStream(ArchivoRespaldo);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject (guardar);
		o.close();
		f.close();
		}
		catch (IOException e)
		{ e.printStackTrace();
		throw new PersistenciaException("error respaldar");
		}
		
	}

	public Guardar recuerde(String ArchivoRespaldo) throws PersistenciaException{ 
		try
		{
		FileInputStream f = new FileInputStream(ArchivoRespaldo);
		ObjectInputStream o = new ObjectInputStream(f);
		Guardar guardar = new Guardar();
		/*guardar = o;*/
		o.close();
		f.close();
		return guardar;
		}
		catch (IOException e)
		{ e.printStackTrace();
		throw new PersistenciaException("error recuperar");
	
		}
	}
	
	
}
