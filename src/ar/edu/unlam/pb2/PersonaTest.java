package ar.edu.unlam.pb2;

import org.junit.Test;

public class PersonaTest {
	@Test
	public void personaQuePersonea(){
		Persona persona1 = new Persona();
		Persona persona2 = new Estudiante();
		
		Estudiante estudiante1 = (Estudiante) persona2;
		// Polimorfismo_Estudiante estudiante2 = new Polimorfismo_Persona();   Error
		persona1.saludar();
		persona2.saludar();
		estudiante1.saludar();
		estudiante1.darPresente();
		//persona2.darPresente(); Error persona2 es de tipo Persona
		Medico drMario = new Medico();
		drMario.curar(persona1);
		drMario.curar(persona2);
		drMario.curar(estudiante1);
		drMario.curar(drMario);
		Congreso asist1 = new Congreso();
		asist1.agregarAsistente(persona1);
		asist1.agregarAsistente(persona2);
		asist1.agregarAsistente(drMario);
		asist1.saludarATodos();
		
		
		
		
		
		

		
		
		
		
	}

}
