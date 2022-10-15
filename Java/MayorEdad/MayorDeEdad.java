package ejerciciosTema2;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		System.out.print("¿Cuál es tu edad?: ");
		Scanner sc=new Scanner(System.in);
		int edad=sc.nextInt();
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		sc.close();

	}

}
