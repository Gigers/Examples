package Controle;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		
		int escolha;
		String choose;
		Scanner input = new Scanner(System.in);
		
		System.out.println("O que deseja saber ? ");
		System.out.println("1 - Qual o sentido da vida ?");
		System.out.println("2 - A terra é plana ?");
		System.out.println("3 - Há vida fora da terra ?\n");
		escolha = input.nextInt();
		
		
		switch(escolha) {
		case 1:
			System.out.println("Tem certeza que deseja continuar ?");
			choose = input.next();
			
			if(choose.toLowerCase().equals("sim")) {
				System.out.println("42");
			}else {
				System.out.println("Ótima escolha");
				System.exit(0);
			}
			
			break;
		case 2:
			System.out.println("Mas é claro!");
			break;
		case 3:
			System.out.println("Se preocupe com a terra por agora, pois quase não há vida aqui");
			break;
		default:
			System.out.println("Desculpe não entendi");
			break;
		}
	input.close();
	}
}
