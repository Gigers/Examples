package classe;

/*
 * As atribuições por valor e por referência tem diferenças bastante interessantes
 * 
 * Por valor:
 * 
 * As declarações por valor criar copias do valor inicial, veja:
 * 
 * a = 2; -> Aqui o 'a' recebeu uma cópia do valor 2
 * 
 * Ao adicionar uma outra variavel que recebe o valor de 'a' esta receberá
 * uma cópia, veja>
 * 
 * b = a; -> 'b' passou a ter o valor de 'a', ou seja 2
 * 
 * caso eu faça qualque coisa com a variavel 'a', não mudará em nada a variavel 'b'
 * 
 * isso porque como dito são copias e não estão lincadas
 * 
 * OBS: A atribuição por valor ocorre apenas com os tipos primitivos
 * 
 * Por referência:
 * 
 * Diferente das variaveis por valor, as variaveis de referência compartilham
 * os endereços. Funciona de forma parecida a um ponteiro na liguagem C
 * 
 * Veja:
 * 
 * Object a = new Object();
 * 
 * caso eu crie uma outra variavel que rebeca 'b', elas irão ter o mesmo valor,
 * porém ficarão ligadas, isso significa que se 'b' for alterado 'a' também será
 * 
 */

public class ValorVSReferencia {
	
	static void porValor(double numero) {
		numero++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		final Produto produto = new Produto("Caneta", 1);
		//O final serve para tornar constante o valor da referência de 'produto'
		//Isso em casos de valores atribuidos por referencia
		
		
		Produto produto2 = produto;
		produto2.nome = "Lapis";
		
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
		System.out.println(produto.nome);
	}

}
