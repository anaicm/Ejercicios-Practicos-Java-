package ejerciciosTema2;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dime un número ");
		int numero1=sc.nextInt();
		System.out.print("Dime un número ");
		int numero2=sc.nextInt();
		if (numero1>numero2) {
			System.out.println("El número mayor es: " +numero1);
		}else if(numero1==numero2) {
			System.out.println("Los números son iguales "+ numero1);
		}else {
			System.out.println("El número mayor es: "+numero2);
		}
	
		sc.close();

	}

}
