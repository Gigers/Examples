package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	/*Quando um static é definido, a maneira correta de se modificar o valor é através da propria classe
	* Por exemplo: Produto.desconto = 15;
	* Isso ocorre porque com a definição static, a variavel passa ser de responsabilidade da classe e não do objeto
	*/
	Produto(){
		//Construtor padrão
	}
	
	Produto(String nome, double preco){ //,double desconto){
		//Com a modificação do static acima, perde-se o sentido manter o desconto no construtor
		//Assim ele foi removido, fazendo com que a forma de acesso a variavel desconto seja através da classe, veja:
		//Produto.desconto -> Conforme citado acima
		
		this.nome = nome;
		this.preco = preco;
		//this.desconto = desconto;
	}
		
	double precoComDesconto() {
		return preco - preco * desconto;
	}
		
}
