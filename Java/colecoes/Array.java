package Colecoes;

import javax.swing.JOptionPane;

public class Array {

	// Criando arrays
	// Arrays são estruturas de dados homogêneas,
	// Eles tem tamanho limitado e são indexados
	// Arrays tem tamanhos fixos

	public static void main(String[] args) {

		//tipo
		double[] notasJoao = {7.0, 8.7, 6.2, 4.9, 9.7};
		//Além desta definição as seguintes também são válidas
		//double notasJoao[] = {};
		//double []notasJoao = {};
		
		//Server também
		double[] notasPedro = new double[5];
		notasPedro[0] = 6.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 6.5;
		notasPedro[4] = 9.8;
		
		double totalJ = 0;
		for(double nota: notasJoao) {
			totalJ += nota;
		}
//		for(int i = 0; i < notasJoao.length; i++) {
//			totalJ += notasJoao[i];
//		}
			
		double totalP = 0;
		for(double nota: notasPedro) {
			totalP += nota;
		}
//		for(int i = 0; i < notasPedro.length; i++)
//			totalP += notasPedro[i];
		
		JOptionPane.showMessageDialog(null, "A média de João é " + totalJ / notasJoao.length);
		JOptionPane.showMessageDialog(null, "A média de Pedro é " + totalP / notasPedro.length);
		
		if(totalJ / notasJoao.length > totalP / notasPedro.length) {
			JOptionPane.showMessageDialog(null, "O João teve a maior nota!!!");
		}else {
			JOptionPane.showMessageDialog(null, "Pedro teve a maior nota!!!");
		}
		
	}

}
