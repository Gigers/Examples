package classe;

import javax.swing.JOptionPane;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		String value;
		int v1, v2;
		
		Calculadora calc = new Calculadora();
		
		value = JOptionPane.showInputDialog("Insira um valor de a");
		v1 = Integer.parseInt(value);
		value = JOptionPane.showInputDialog("Insira o valor de b");
		v2 = Integer.parseInt(value);
		
		calc.somar(v1, v2);
		calc.acrescentar(v1);
		
		JOptionPane.showMessageDialog(null,v1 + " + "+ v2 + " + " + v1 + " = " + calc.obterResultado());
		
		calc.limpar();

		
	}

}
