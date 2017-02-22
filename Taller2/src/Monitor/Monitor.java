package Monitor;

public class Monitor {
	private int cantLectores;
	private boolean escribiendo;
	private Condition puedeLeer, puedeEscribir;
	
	public Monitor(){
		cantLectores = 0;
		escribiendo = false;
		puedeLeer = new Condition();
		puedeEscribir = new Condition();
	}
	public synchronized void comenzarLectura (){
		if (escribiendo || puedeEscribir.NoVacio()){
			try{
				puedeLeer.wait_();
			} catch (InterruptedException e){
				
			}
		}
		cantLectores += 1;
		puedeLeer.LiberarTodo();
		
	}
	
	public synchronized void lecturaTerminada(){
		cantLectores -= 1;
		if (puedeEscribir.NoVacio()){
			puedeEscribir.LiberarUno();
		} else if (puedeLeer.NoVacio()){
			puedeEscribir.LiberarTodo();
		}
	} 
	
	public synchronized void comenzarEscritura(){
		if(cantLectores>0 || escribiendo){
			try{
				puedeEscribir.wait_();
			} catch (InterruptedException e){
			}
		}
		escribiendo = true;
	}
	
	public synchronized void escrituraTermianda(){
		escribiendo = false;
		if (puedeLeer.NoVacio()){
			puedeLeer.LiberarUno();
		} else if (puedeEscribir.NoVacio()){
			puedeEscribir.LiberarUno();
		} else {
			puedeLeer.LiberarTodo();
		}
	}
}