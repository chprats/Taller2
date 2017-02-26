package persistencia;

import java.io.*;
import persistencia.Guardar;
import Logica.exception.PersistenciaException;

public class Respaldo implements Serializable{
	
	
	
	
	
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

	public Guardar recuerde(String ArchivoRespaldo) throws PersistenciaException, Throwable{ 
		try
		{
		FileInputStream f = new FileInputStream(ArchivoRespaldo);
		ObjectInputStream o = new ObjectInputStream(f);
		
		Guardar guardar = (Guardar) o.readObject();
		/*guardar = new Guardar();*/
		
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