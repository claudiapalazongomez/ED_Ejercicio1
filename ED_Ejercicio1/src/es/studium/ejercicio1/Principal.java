package es.studium.ejercicio1;

public class Principal
{

	public static void main(String[] args)
	{
		//CONSTRUCTOR VAC�O
		Persona persona1 = new Persona (); 
		persona1.setNombre("Laura");
		persona1.setApellidos("Garc�a Navas");
		persona1.setDni("67849214");
		persona1.setDomicilio("Avda, La Barzola, n�15");
		persona1.setTelefono(657923451);
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " " + persona1.getDni() + " " + persona1.getDomicilio() + " " + persona1.getTelefono());
		
		
		//CONSTRUCTOR POR PAR�METROS
		Persona persona2 = new Persona ("Jorge", "S�nchez Garc�a", "34231232", "Avda, La Paz, n�3", 954654756); 
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + persona2.getDni() + " " + persona2.getDomicilio() + " " + persona2.getTelefono());

	}
	
	

}
