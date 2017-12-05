package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		/* Testes lógicos
		 * 
		 * O cenário para executar o teste é o seguinte:
		 * 
		 * Existe um trabalhador, ele precisa executar dois trabalhos para comprar uma TV de 50' e um sorvete
		 * caso apenas um dos trabalhos seja executado ele irá comprar o sorvete e uma TV de 32'.
		 * Se nenhum trabalho for executado, ele vai ficar em casa sem nada =(
		 * 
		 */
		
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		// ^ = ou exclusivo
		
		System.out.println(comprouSorvete);
		System.out.println(comprouTv50);
		System.out.println(comprouTv32);
		
		//Operador unário intruso
		//Se ele comprar o sorvete ele fica sem fome,
		//caso contrário irá passar fome =(
		System.out.println("Fome = " + !comprouSorvete);
		
	}

}
