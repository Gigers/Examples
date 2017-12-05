package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		
		//Atribuição condicional (Operador ternário(?))
		
		//Neste exemplo a atribuição depende do resultado do teste
		//Veja que o resultado será aprovado caso a nota seja maior
		//que 7, caso contrário o resultado fica recuperação
		double nota = 7.1;
		String resultado = nota >= 7 ? "Aprovado" : "Recuperação";
		
		System.out.println(resultado);
		
	}

}
