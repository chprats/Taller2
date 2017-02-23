package Persistencia;

import java.io.Serializable;

import Logica.bus.Buses;
import Logica.excursion.Excursiones;

public class Guardar implements Serializable {
	

		private Excursiones excuGuar;
		private Buses busesGuar;
		
		
		
		
		
		
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
		
		
		
		
	

}
