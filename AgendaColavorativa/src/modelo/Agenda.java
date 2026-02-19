package modelo;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> contactos = new ArrayList<>();

	public Agenda() {

		this.contactos=contactos;
		
	}

	public void agregarContacto(Contacto c) {

		contactos.add(c);
		
		
	}

	public void eliminarContacto(String nombre) {

	}

	public String buscarContacto(String nombre) {

		return nombre;
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
