package Controle;

import javax.swing.JOptionPane;

public class DoWhile {
	
	public static void main(String[] args){
		
		int nums = 0;

		//Perceba que a mensagem será exibida ao menos uma vez
		//Mesmo que o 'nums' for 0, isso porque Do-while
		//execute e depois confirma
		
		do {
			JOptionPane.showConfirmDialog(null, "Deseja continuar ?");
		}while(nums != 0);
	}

}
