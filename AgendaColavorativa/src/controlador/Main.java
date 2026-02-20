
package controlador;

import java.util.List;

import modelo.Agenda;
import modelo.Contacto;

public class Main {
	

	
	private static Agenda agenda = new Agenda();

	
	public static void main(String[] args) {
		
		Contacto contacto1 = new Contacto("Pepe","pepillo@gmail.com",123456789 );
		
		Contacto contacto2 = new Contacto("jose","jose@gmail.com",987654321 );
		
		agenda.agregarContacto(contacto1);
		
		agenda.buscarContacto("pepe");
		

		agenda.eliminarContacto("pepe");
		
		List<Contacto> contactosListados = agenda.listarContactos();
		
        for (Contacto c : contactosListados) {
        	
            System.out.println(c);
        }
	}
}
