package Controle;

import javax.swing.JOptionPane;

public class While {
	public static void main(String[] args) {
		
		int cont = 1;
		double nota = 0;
		String value = "0";
		
		JOptionPane.showMessageDialog(null, "Bem-vindo!\n"
				+ "Este é um programa para calcular sua nota\n"
				+ "Insira suas informações para ter o calculo");
		
		/*
		 * Neste exemplo o while irá repetir a estrutura de repetição
		 * que está dentro de {chaves} até que 'cont' seja menor ou igual a 4
		 */
		
		while(cont <= 4) {
			
			value = JOptionPane.showInputDialog("Insira a nota n° " + cont);
			
			nota += Double.parseDouble(value);
			
			cont++;
		}
		
		JOptionPane.showMessageDialog(null, "Sua média é " + (nota / cont));
		
	}
	

}
