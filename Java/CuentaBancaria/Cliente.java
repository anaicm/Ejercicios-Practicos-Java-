package CuentaBancaria;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String dni;

	/**
	 * m�todo constructor
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
	 * m�todo de consulta nombre del cliente
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * m�todo de consulta apellidos del cliente
	 * 
	 * @return cliente
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * m�todo de consulta del dni del Cliente
	 * 
	 * @return dni
	 */

	public String getDni() {
		return dni;
	}

	/**
	 * m�todo para la actualizaci�n del nombre del cliente
	 * 
	 * @param nom
	 */
	public void nombre(String nom) {
		nombre = nom;
	}

	/**
	 * m�todo para la actualizaci�n de los apellidos del cliente
	 * 
	 * @param apell
	 */
	public void apellidos(String apell) {
		apellidos = apell;
	}

	/**
	 * m�todo para la actualizaci�n del dni del cliente
	 * 
	 * @param d
	 */
	public void dni(String d) {
		dni = d;
	}

	/**
	 * m�todo que devuelve nombre y apellidos
	 * 
	 * @return nombre y apellidos.
	 */

	public String nombreCompleto() {
		return nombre + ", " + apellidos;
	}
}
