package CuentaBancaria;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String dni;

	/**
	 * método constructor
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 */

	public Cliente(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * método de consulta nombre del cliente
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * método de consulta apellidos del cliente
	 * 
	 * @return cliente
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * método de consulta del dni del Cliente
	 * 
	 * @return dni
	 */

	public String getDni() {
		return dni;
	}

	/**
	 * método para la actualización del nombre del cliente
	 * 
	 * @param nom
	 */
	public void nombre(String nom) {
		nombre = nom;
	}

	/**
	 * método para la actualización de los apellidos del cliente
	 * 
	 * @param apell
	 */
	public void apellidos(String apell) {
		apellidos = apell;
	}

	/**
	 * método para la actualización del dni del cliente
	 * 
	 * @param d
	 */
	public void dni(String d) {
		dni = d;
	}

	/**
	 * método que devuelve nombre y apellidos
	 * 
	 * @return nombre y apellidos.
	 */

	public String nombreCompleto() {
		return nombre + ", " + apellidos;
	}
}
