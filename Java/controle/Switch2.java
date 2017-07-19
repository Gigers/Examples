package Controle;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		int idade;

		Scanner input = new Scanner(System.in);

		System.out.println("Qual número de seu pedido ?");
		idade = input.nextInt();

		switch(idade) {
		case 1:
			System.out.println("Pão e queijo...Já esta quase pronto");
			break;
		case 2:
			System.out.println("Pão de batata...Ainda vai demorar");
			break;
			
		default:
			System.out.println("Pedido não encontrado.");
			break;
			
		}
		input.close();
	}

}
