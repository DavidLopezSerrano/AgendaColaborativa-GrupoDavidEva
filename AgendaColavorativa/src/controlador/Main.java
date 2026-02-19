package controlador;

import java.util.List;

import modelo.Agenda;
import modelo.Contacto;

public class Main {
	

	
	private static Agenda agenda = new Agenda();

	
	public static void main(String[] args) {
		
		Contacto contacto1 = new Contacto("Pepe","pepillo@gmail.com",123456789 );
		
		agenda.agregarContacto(contacto1);
		
		List<Contacto> contactosListados = agenda.listarContactos();
		
        for (Contacto c : contactosListados) {
        	
            System.out.println(c);
        }
	}
}
