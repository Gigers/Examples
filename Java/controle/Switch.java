package Controle;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {

		String mes;
		
		/*
		 * No switch recebemos a variavel, e analisamos para ver se algum caso definido 
		 * nos cases se encaixam com o input realizado.
		 */
		
		mes = JOptionPane.showInputDialog("Descubra seu signo\nEm qual mês você nasceu ?");
		
		
		switch(mes) {
		case "janeiro":
			JOptionPane.showMessageDialog(null, "Capricornio");
			break; //O break é colocado para evitar que após a execução do case, o case abaixo seja executado
				//Porém caso seja necessário que o caso de baixo seja executado basta remover o break
		case "fevereiro":
			JOptionPane.showMessageDialog(null, "Peixes");
			break;
		
		case "março":
			JOptionPane.showMessageDialog(null, "Áries");
			break;
			
		case "abril":
			JOptionPane.showMessageDialog(null, "Touro");
			break;
			
		case "maio":
			JOptionPane.showMessageDialog(null,"Touro");
			break;
		
		case "junho":
			JOptionPane.showMessageDialog(null, "Câncer");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opa! Assim não.\nInsira uma opção valida");
		}
		
				
	}

}
