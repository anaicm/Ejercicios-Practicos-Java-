package prAgenda;

public class Agenda {
	protected Contacto[] contactos;
	protected int numCont;
	private int CAP_MAXIMA = 500;

	public Agenda(int tam) {
		contactos = new Contacto[tam];
		numCont = 0;
	}

	public Agenda() {
		contactos = new Contacto[CAP_MAXIMA];
		numCont = 0;
	}

	public Contacto buscaContacto(String nombre, String apellido) {
		for (int i = 0; i < numCont; i++) {
			if (contactos[i].getNombre().equalsIgnoreCase(nombre)
					&& contactos[i].getApellido().equalsIgnoreCase(apellido)) {
				return contactos[i];
			}
		}
		return null;
	}

	public void agregaContacto(Contacto c) {
		Contacto contacto = buscaContacto(c.getNombre(), c.getApellido());
		if (contacto == null) {
			contactos[numCont] = c;
			numCont++;
		}
	}

	public void eliminaTodos() {
		for (int i = 0; i < numCont; i++) {
			contactos[numCont] = contactos[i];
		}
		numCont = 0;
	}

	public int nroContactosConEmail(String dominio) {
		int numContatos = 0;
		for (int i = 0; i < numCont; i++) {
			if (contactos[i].getCorreoElectronico() == dominio) {
				return numContatos++;
			}
		}
		return 0;
	}

	public String toStirng() {

		String cadena = "";
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null) {
				cadena += contactos[i].toString();

			}
			if (i != numCont - 1) {
				cadena += "-";
			}
		}
		return cadena;
	}

}
