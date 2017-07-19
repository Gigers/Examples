package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		//Definindo valor de desconto
		Produto.desconto = 0.25;
		/*
		 * Veja que não foi necessário nem instânciar a classe, isso porque variaveis static
		 * não necessitam ter classe instanciada
		 */
		
		Produto produto1 = new Produto();
		
		
		produto1.nome = "Notebook dell";
		produto1.preco = 2300;
		//produto1.desconto = 0.15;
		
		Produto produto2 = new Produto("Caneta BIC Preta" , 2.83);//, 25);
		
		System.out.println("O desconto do produto 1 é " + produto1.desconto);
		System.out.println("O desconto do produto 2 é " + produto2.desconto);
		
		///System.out.println(produto1.precoComDesconto());
		//System.out.println(produto2.precoComDesconto());
		
	}
	
}
