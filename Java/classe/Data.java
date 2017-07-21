package classe;

/*
 * Não há problema em ter vários construtores, desde que as assinaturas sejam diferentes
 */

public class Data {
	
	int dia, mes, ano;
	double preco;
	
	Data(){
		//Construtor padrão
		/*
		 * O construtor padrão (Sem parametros)
		 * deve ser definido caso outro construtor já exista
		 */
		
		this(1,1,2017); //Representa um dos construtores de sua propria classe;
	}
	
	//Construtor
	Data(int dia, int mes, int ano){
		this.dia = dia; //O this é utilizado para dizer que a variavel que recebe pertence a classe
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(int dia, int mes, int ano, double preco){
		
		//this significa o objeto atual
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.preco = preco;
	}
	
	String formatar() {
		
		return String.format("%d/%d/%d", dia,mes,ano);
	
	}
	String formatarCasamento() {
		return String.format("Casei em %d/%d/%d e gastei %.3f", dia, mes, ano, preco);
	}

}
