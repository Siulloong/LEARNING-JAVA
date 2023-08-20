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
		char z;
			
		System.out.print("Valor : ");
		x=sc.nextDouble();
		System.out.print("Nome : ");
		n=sc.next();
		System.out.print("Nro int : ");
		y=sc.nextInt();
				
		// pegar apenas uma letra (ordem numerica) da entrada
		System.out.println("Primeira letra do que digitou");
		z=sc.next().charAt(2);
					
		System.out.printf("Você digitou: %.2f%n",x);
		System.out.println("Você digitou: "+n);
		System.out.printf("Você digitou: %d",y);
		System.out.println("Primeira Letra :"+z);
		System.out.println("");
		
		// ENTRADA DE DADOS ATE QUE QUE DÊ ENTER (SCANNER.NEXTLINE)
		
		System.out.print("Valor : ");
		x=sc.nextDouble();
		System.out.print("Nome : ");
		n=sc.next();
		System.out.print("Nro int : ");
		y=sc.nextInt();
		
		System.out.println(x);
		System.out.println(n);
		System.out.println(y);
		System.out.println(z);	
		
		// ENTRADA DE DADOS todas na mesma linha (scanner.next())
			
		String s1,s2,s3;
				
	    s1=sc.nextLine();
		s2=sc.nextLine();
		s3=sc.nextLine();
		
		System.out.println(x);
		System.out.println(n);
		System.out.println(y);
		System.out.println(z);	
		
		
	}

}
