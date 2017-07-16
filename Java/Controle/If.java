package Controle;

import javax.swing.JOptionPane;

public class If {
	
	public static void main(String[] args) {
		String value;
		Double nota;
		
		value = JOptionPane.showInputDialog("Qual foi sua nota ?");
		
		nota = Double.parseDouble(value);
				
		if(nota >= 9) {
			JOptionPane.showMessageDialog(null, "Foi para o quadro de honra!");
		}else {
			JOptionPane.showMessageDialog(null, "Opa não foi dessa vez =(");
		}
	}

}
