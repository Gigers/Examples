package Colecoes;

public class Matriz {
	
	public static void main(String[] args) {
		double[][] notasJoao = {{7.0, 8.6}, {6.2, 9.7}};
		
		double[][] notasPedro = new double[2][2];
		
		/*
		notasPedro[0][0] = 7.0;
		notasPedro[0][1] = 8.6;
		notasPedro[0][2] = 9.5;
		notasPedro[1][0] = 6.5;
		notasPedro[1][1] = 7.0;
		notasPedro[1][2] = 7.5;
		notasPedro[2][0] = 8.0;
		notasPedro[2][1] = 8.0;
		notasPedro[2][2] = 5.5;
		*/
		
		double totalP = 0;
		int qntdP = 0;
		for(int i = 0; i < notasPedro.length; i++) {
			for(int j = 0; j < notasPedro[i].length; j++) {
				
				totalP += notasPedro[i][j] = i * 2 + j * 2;
				qntdP++;
			}
		}
		double totalJ = 0;
		int qntdJ = 0;
		for(double[] notaP: notasJoao) {
			for(double nota: notaP) {
				totalJ += nota;
				qntdJ++;
			}
		}
		
		System.out.println(totalJ / qntdJ);
		System.out.println(totalP / qntdP);

	}

}
