package ejerciciosTema3_Diciembre_Cesur;


/**
 * Clase que gestiona la representacion de un punto en un
 * plano.
 * 
 */
public class Punto2D {
	
	/**
	 * Coordenada X del punto.
	 */
	private double x;
	
	/**
	 * Coordenada Y del punto.
	 */
	private double y;
	
	/**
	 * Creamos un punto en el origen de coordenadas.
	 */
	public Punto2D(){
		this (0,0); //x = 0.0; 	y = 0.0;
	}
	
	/**
	 * Creamos un punto en una posicion determinada del plano.
	 * @param a Coordeanda X de la posicion del punto.
	 * @param b Coordenada Y de la posicion del punto.
	 */
	public Punto2D(double a, double b){
		x = a;
		y = b;
	}
	
	/**
	 * Obtenemos la coordenada X del punto.
	 * @return Coordenada X del punto.
	 */
	public double abscisa(){
		return x;
	}
	
	/**
	 * Obtenemos la coordenada Y del punto
	 * @return Coordenada Y del punto.
	 */
	public double ordenada(){
		return y;
	}
	
	/**
	 * Calcula la distancia que hay hasta un punto.
	 * @param p Punto hasta donde calcular la distancia.
	 * @return Distancia entre los puntos.
	 */
	public double distancia(Punto2D p){
		double res = Math.sqrt(Math.pow((p.abscisa() - this.abscisa()),2) + 
						       Math.pow((p.ordenada() - this.ordenada()),2));
		return res;
	}
	
	/**
	 * Cambiamos la coordenada X del punto.
	 * @param a Nueva coordenada X.
	 */
	public void abcisa(double a){
		x = a;
	}
	
	/**
	 * Cambiamos la coordenada Y del punto.
	 * @param b Nueva coordenada Y.
	 */
	public void ordenada(double b){
		y = b;
	}
	
	/**
	 * Trasladamos el punto a una nueva posicion.
	 * @param a Desplazamiento de la coordenada X.
	 * @param b Desplazamiento de la coordenada Y.
	 */
	public void trasladar(double a, double b){
		x = x + a;
		y = y + b;
	}
	
	/**
	 * Representamos el punto mediante un String.
	 */
	public String toString(){
		return ("(" + abscisa() + ", " + ordenada() + ")");
	}
}
