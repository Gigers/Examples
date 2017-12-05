package classe;

public class Calculadora {
	
	double resultado;
	
	//Recebe valor e retorna valor
	double somar(double a, double b) {
		resultado = a + b;
		
		return resultado;
	}
	
	//Recebe valor porém não retorna
	void acrescentar(double a) {
		resultado += a;
	}
	
	//Não recebe valor porém retorna valor
	double obterResultado() {
		return resultado;
	}
	
	void limpar() {
		resultado = 0;
	}

}
