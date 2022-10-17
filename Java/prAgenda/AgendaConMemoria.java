package prAgenda;

public class AgendaConMemoria extends Agenda {
	private Contacto ultimoContacto;

	public AgendaConMemoria() {
		super();

	}

	public Contacto ultimoContacto() {
		return ultimoContacto;
	}

	@Override
	public Contacto buscaContacto(String nombre, String apellido) {
		for (int i = 0; i < super.numCont; i++) {
			if (contactos[i].getNombre().equalsIgnoreCase(nombre)
					&& contactos[i].getApellido().equalsIgnoreCase(apellido)) {
				ultimoContacto = contactos[i];
				return contactos[i];
			}
		}
		return null;
	}

}
