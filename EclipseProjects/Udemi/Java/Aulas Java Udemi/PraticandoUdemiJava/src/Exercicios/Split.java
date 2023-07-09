package Exercicios;

/*
 * separa o texto usando o caracter indicado no split(" ") - aqui no caso o espaço
 */

public class Split {

	public static void main(String[] args) {
		String s = "Ederson da Cruz Araujo";
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);

	}

}
