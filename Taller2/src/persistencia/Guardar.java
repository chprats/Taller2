package persistencia;

import java.io.Serializable;
import Logica.bus.Buses;
import Logica.exception.PersistenciaException;
import Logica.excursion.Excursiones;
import persistencia.Respaldo;

public class Guardar implements Serializable {
	

		private Excursiones excuGuar;
		private Buses busesGuar;
		
		
		
		

		public Respaldo Respaldo() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		public Guardar(Excursiones excuGuar, Buses busesGuar) {
			super();
			this.excuGuar = excuGuar;
			this.busesGuar = busesGuar;
		}
		public Guardar() {
			
		}
		public Excursiones getExcuGuar() {
			return excuGuar;
		}
		public void setExcuGuar(Excursiones excuGuar) {
			this.excuGuar = excuGuar;
		}
		public Buses getBusesGuar() {
			return busesGuar;
		}
		public void setBusesGuar(Buses busesGuar) {
			this.busesGuar = busesGuar;
		}
		
		
		public void recuperarDatos() throws PersistenciaException, Throwable{
			
			
			Respaldo res = Respaldo();				
			Guardar guar = res.recuerde("ArchivoRespaldo8.dat");
			this.busesGuar = guar.getBusesGuar();
			this.excuGuar = guar.getExcuGuar();
			
			
			
		}
		
		public void respaldarDatos () throws PersistenciaException{
			
			Guardar guar = new Guardar(this.excuGuar,this.busesGuar);
			Respaldo res = new Respaldo();
			res.respaldar("ArchivoRespaldo8.dat", guar);
		
			
		}
		
		
		
		
	
		
		
		
	

}