package Controle;

import java.util.Scanner;

public class IfDois {
	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);
		double nota;
		
		System.out.println("Insira sua nota: ");
		nota = value.nextDouble();
		
		if(nota >= 9) {
			System.out.println("Você vai para o hall da fama !");
		}else {
			System.out.println("Ainda não =( Mas logo menos te vejo aqui =D");
		}
		
		value.close();
		
	}
	
	
}
