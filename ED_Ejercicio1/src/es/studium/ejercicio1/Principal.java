package es.studium.ejercicio1;

public class Principal
{

	public static void main(String[] args)
	{
		//CONSTRUCTOR VACÍO
		Persona persona1 = new Persona (); 
		persona1.setNombre("Laura");
		persona1.setApellidos("García Navas");
		persona1.setDni("67849214");
		persona1.setDomicilio("Avda, La Barzola, nº15");
		persona1.setTelefono(657923451);
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " " + persona1.getDni() + " " + persona1.getDomicilio() + " " + persona1.getTelefono());
		
		
		//CONSTRUCTOR POR PARÁMETROS
		Persona persona2 = new Persona ("Jorge", "Sánchez García", "34231232", "Avda, La Paz, nº3", 954654756); 
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + persona2.getDni() + " " + persona2.getDomicilio() + " " + persona2.getTelefono());

	}
	
	

}
