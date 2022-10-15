package CuentaBancaria;

public class CuentaBancaria {
	private int numero;
	private double saldo;
	private Cliente titular;
	/**
	 * m�todo constructor.
	 * 
	 * @param numero
	 * @param saldo
	 * @param titular
	 */
	public CuentaBancaria(int numero, double saldo, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	/**
	 * m�todo de consulta del n�mero de cuenta
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * m�todo de consulta del saldo de la cuenta
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * m�todo de consulta del titular de la cuenta
	 * 
	 * @return
	 */
	public Cliente getTitular() {
		return titular;
	}
	/**
	 * m�todo de modificaci�n del n�mero de cuenta
	 * 
	 * @param n
	 */
	public void numero(int n) {
		numero = n;
	}
	/**
	 * m�todo de modificaci�n del saldo de la cuenta
	 * 
	 * @param s
	 */
	public void saldo(double s) {
		saldo = s;
	}
	/**
	 * m�todo de modificaci�n del titular de la cuenta
	 * 
	 * @param t
	 */
	public void titular(Cliente t) {
		titular = t;
	}
//metodos de ingreso y de reintegro
	/**
	 * 
	 * @param ingreso
	 * @return devuelve el sado mas el ingreso realizado
	 */
	public double ingreso(double ingreso) {
		return saldo + ingreso;
	}
	/**
	 * 
	 * @param reintegro
	 * @return si tiene saldo suficiente devuelve el saldo actualizado despues de la
	 *         retirada de saldo pero si no devuelve -1
	 */
	public double reintegro(double reintegro) {
		if (reintegro <= saldo) {
			return saldo - reintegro;
		}
		return -1;
	}
	/**
	 * dniTitular
	 * 
	 * @return devuelve el dni del titular que esta en la clase cliente
	 */
	public String dniTitular() {
		return titular.getDni();
	}
}
