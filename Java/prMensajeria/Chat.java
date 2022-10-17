package prMensajeria;

public class Chat {
	public String nombre;
	public Mensaje[] coleccion;
	public int numCont;
	public int CAP_MAXIMA = 100;

	public Chat(String nombre, int tam) {
		this.nombre = nombre;
		coleccion = new Mensaje[tam];
	}

	public Chat(String nombre) {
		this.nombre = nombre;
		coleccion = new Mensaje[CAP_MAXIMA];

	}

	public void enviar(Mensaje m) {
		if (numCont == coleccion.length) {
			throw new RuntimeException("La Lista está llena");
		}
		coleccion[numCont] = m;
		numCont++;
	}

	public String getNombreChat() {
		return nombre;
	}

	public Mensaje ultimoMensaje() {
		return coleccion[numCont];
	}

	public String ultimoInterviniente() {
		return coleccion[numCont].getContacto();
	}

	public int numeroIntervenciones(String contacto) {
		int total = 0;
		for (int i = 0; i < numCont; i++) {
			if (coleccion[i].getContacto() == contacto) {
				total++;
				return total;
			}

		}

		return 0;
	}

	public Mensaje ultimoMensajeIncluyendo(String expresion) {
		for(int i=0;i<numCont;i++) {
			if (coleccion[i].getMensaje().contains(expresion)) {
				return coleccion[i];
			}
		}
		return null;
		
	}

}
