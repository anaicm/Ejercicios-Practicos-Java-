package prAlturas;

public class Pais implements Comparable<Pais> {
	private String nombre;
	private String continente;
	private double altura;
	/**
	 * @param nombre
	 * @param continente
	 * @param altura
	 */
	public Pais(String nombre, String continente, double altura) {
		super();
		this.nombre = nombre;
		this.continente = continente;
		this.altura = altura;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the continente
	 */
	public String getContinente() {
		return continente;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	@Override
	public boolean equals(Object o) {
		boolean iguales=false;
		if(o instanceof Pais) {
			iguales=this.nombre.equals(((Pais) o).nombre);
			return iguales;
		}
	return false;
	}
	@Override
	public int hashCode() {
		return this.nombre.hashCode();
	}
	@Override
	public int compareTo(Pais o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	@Override
	//nombre,continente,altura)
	public String toString() {
		return "País ("+nombre+","+continente+","+altura+")";
	}
	
	
}
