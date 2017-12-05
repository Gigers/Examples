package classe;

import javax.swing.JOptionPane;

public class DataTeste {

	public static void main(String[] args) {

		Data nascimento = new Data(29,01,1892); // Instanciando a classe Data
		//new => Novo objeto
		
		Data casamento = new Data();
		
		//casamento.ano = 2015;
		//casamento.dia = 27;
		//casamento.mes = 11;
		casamento.preco = 19.9; 
	
		JOptionPane.showMessageDialog(null, nascimento.formatar());
		
		JOptionPane.showMessageDialog(null,casamento.formatarCasamento());
	}

}
