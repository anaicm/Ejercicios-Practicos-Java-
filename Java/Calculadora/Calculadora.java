package ejerciciosTema2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		int resu;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca  operador: ");
		String operacion = sc.next();
		System.out.print("Introduzca  primer numero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo numero: ");
		int num2 = sc.nextInt();

		switch (operacion) {
		  case "+":
			resu = num1 + num2;
			System.out.println(num1 + " " + operacion + " " + num2 + " = " + resu);
			break;
		  case "-":
			resu = num1 - num2;
			System.out.println(num1 + " " + operacion + " " + num2 + " = " + resu);
			break;
		  case "*":
			resu = num1 * num2;
			System.out.println(num1 + " " + operacion + " " + num2 + " = " + resu);
			break;
		  case "/":
			resu = num1 / num2;
			System.out.println(num1 + " " + operacion + " " + num2 + " = " + resu);
			break;
		  case "%":
			resu = num1 % num2;
			System.out.println(num1 + " " + operacion + " " + num2 + " = " + resu);
			break;
		  default:
			System.out.print("Operador incorrecto");

		}

		sc.close();
	}
}
