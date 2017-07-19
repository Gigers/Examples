package classe;

import javax.swing.JOptionPane;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario mecanico = new Funcionario("José", 23, 123, 2500);
		Funcionario terceiro = new Funcionario("Pedro", 45, 2500);
		
		JOptionPane.showMessageDialog(null, mecanico.trabalhar());
		JOptionPane.showMessageDialog(null, terceiro.trabalhar());
		
		
	}

}
