package es.studium;

import java.util.Scanner;

public class MinusculaMayuscula
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String frase;
		System.out.println("Dame una cadena");
		frase= teclado.nextLine();
		teclado.close();
		System.out.println(frase.toLowerCase());
		System.out.println(frase.toUpperCase());
		
	}
}
