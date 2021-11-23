package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole  {
		
	List<String> idiomi;
	public Parole() {
		//TODO
		idiomi= new ArrayList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		idiomi.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(idiomi);
		return idiomi;
	}
	
	public void reset() {
		// TODO
		idiomi.clear();
	}
	
	public void cancella(String prescelta) {
		idiomi.remove(prescelta);
	}

}
