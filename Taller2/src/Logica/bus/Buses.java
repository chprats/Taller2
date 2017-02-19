package Logica.bus;

import java.util.TreeMap;

public class Buses {
	
	private TreeMap<String,Bus> maTreeBuses = new TreeMap<String,Bus>();

	public TreeMap<String,Bus> getMaTreeBuses() {
		return maTreeBuses;
	}

	public void setMaTreeBuses(TreeMap<String,Bus> maTreeBuses) {
		this.maTreeBuses = maTreeBuses;
	}

}
