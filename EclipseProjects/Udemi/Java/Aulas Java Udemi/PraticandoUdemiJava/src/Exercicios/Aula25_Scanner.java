package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aula25_Scanner {

	public static void main(String[] args) {
		
//		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		String n;
		int y;
			
		System.out.print("Valor : ");
		x=sc.nextDouble();
		System.out.print("Nome : ");
		n=sc.next();
		System.out.print("Nro int : ");
		y=sc.nextInt();
				
		System.out.printf("Você digitou: %.2f%n",x);
		System.out.println("Você digitou: "+n);
		System.out.printf("Você digitou: %d",y);
		
		
	}

}
