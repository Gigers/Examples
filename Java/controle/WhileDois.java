package Controle;

import java.util.Scanner;

public class WhileDois {
	
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		double total = 0, nota = 0;
		int cont = 0;
		
		/*
		 * O while é uma estrutura de repetição, 
		 * que neste caso irá repetir o laço de comandos que está
		 * dentro das {chaves}, até que nota seja igual a -1
		 */
		
		while(nota != -1) {
			System.out.print("Insira sua nota: ");
			nota = value.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				cont++;
			}
			
		}
		value.close();
		System.out.println("Sua média é " + (total / cont));
	}

}
