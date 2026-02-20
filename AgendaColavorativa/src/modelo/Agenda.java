package modelo;

import java.util.ArrayList;

public class Agenda {
	
	private static ArrayList<Contacto> contactos = new ArrayList<>();


	public Agenda() {

		this.contactos=contactos;
		
	}

	public void agregarContacto(Contacto c) {

		
		contactos.add(c);
		
		
	}

	public static void eliminarContacto(String nombre) {
	    for (int i = 0; i < contactos.size(); i++) {
	        if (contactos.get(i).getName().equalsIgnoreCase(nombre)) {
	            contactos.remove(i);
	        } else {
	        	System.out.println("Este contacto no existe");
	        }
	    }
	}

	public String buscarContacto(String nombre) {
        // Recorremos la lista buscando el nombre
        for (Contacto c : contactos) {
            if (c.getName().equalsIgnoreCase(nombre)) {
                return c.toString(); 
            }
        }
        return "Contacto no encontrado";
    }

	public ArrayList<Contacto> listarContactos() {

		return contactos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
}
