package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Congreso {
	
	private List<Persona> asistentes = new LinkedList<Persona>();
		
	public void agregarAsistente(Persona persona){
		this.asistentes.add(persona);
	}
	
	public void saludarATodos(){
		
		for(Persona str : asistentes)
		{
		   str.saludar();
		 }
		
	}
	

}
