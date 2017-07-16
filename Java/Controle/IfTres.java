package Controle;

import javax.swing.JOptionPane;

public class IfTres {

	public static void main(String[] args) {
		//If else if
		
		String value;
		double nota;
		
		value = JOptionPane.showInputDialog("Insira sua nota");
	
		nota = Double.parseDouble(value);
		
		if(nota >= 9) {
			JOptionPane.showMessageDialog(null, "Quadro de honra!");
		}else if(nota >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		}else if(nota >= 5 && nota <= 6) {
			JOptionPane.showMessageDialog(null, "Recuperação");
		
			if(nota == 5) {
				JOptionPane.showMessageDialog(null, "Terá de fazer trabalho para passar");
			}else if(nota == 5.5) {
				JOptionPane.showMessageDialog(null, "Terá de fazer exercício no caderno!");
			}
		
		}else if(nota < 5) {
			JOptionPane.showMessageDialog(null, "Infelizmente você foi reprovado");
		}
		
	}
	
}
