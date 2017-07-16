package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		/*
		 * Aqui será mostrado um pouco da utilização dos wrappers 
		 * Perceba que com eles consigo realizar conversões facilmente
		 */
		
		String resposta1 = JOptionPane.showInputDialog("Qual é sua nota 1 ?");
		String resposta2 = JOptionPane.showInputDialog("Qual é sua nota 2 ?");
		
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		
		System.out.printf("Sua nota é %.2f", (nota1 + nota2) / 2);
	}
	
}
