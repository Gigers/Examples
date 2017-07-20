package Controle;

import javax.swing.JOptionPane;

//O if faz comparações lógicas

public class If {
	
	public static void main(String[] args) {
		String value;
		Double nota;
		
		value = JOptionPane.showInputDialog("Qual foi sua nota ?");
		
		nota = Double.parseDouble(value);
		
		//Para utilizar o if basta inserir dentro de sua notação comparações e testes que retornem valores
		//verdadeiros (true) ou falso (false)
		if(nota >= 9) {
			JOptionPane.showMessageDialog(null, "Foi para o quadro de honra!");
		}else {
			JOptionPane.showMessageDialog(null, "Opa não foi dessa vez =(");
		}
	}

}
