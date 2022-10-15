package ejerciciosTema2;

import java.util.Scanner;

public class TablaDeMultiplicar {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("Introduzca numero para hacer la tabla de multiplicar: ");
		 int num=sc.nextInt();
		 
		 for (int n=1;n<=10;n++) {
			 int resu=num*n;
			 System.out.println(num + " x " +n + " = " +resu);
		 }
		 
		 sc.close();

	}
}
