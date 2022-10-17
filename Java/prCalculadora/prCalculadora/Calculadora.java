package prCalculadora;

public class Calculadora {

	private int numero1;
	private int numero2;
	
	public Calculadora(int num1,int num2) {
		this.numero1=num1;
		this.numero2=num2;
	}
	public int Sumar() {
		Suma sm=new Suma(numero1,numero2);
		return sm.Sumar();
	}
	public int Restar() {
		Resta res=new Resta(numero1,numero2);
		return res.Restar();
	}
}
