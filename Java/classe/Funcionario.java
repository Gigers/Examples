package classe;

public class Funcionario {
	
	String nome;
	int idade, id;
	float salario;
	
	Funcionario (){
		//Definindo construtor vazio (padrão - sem args)
	}
	
	Funcionario (String nome, int idade, int id, float salario){
		//Funcionario interno
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.salario = salario;
	}
	
	Funcionario (String nome, int idade, float salario){
		//Definindo construtor para funcionario terceiro
		
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	String trabalhar() {
		
		if(idade > 18 && idade < 25) { 
			return "Trabalha demais, porém erra bastante!!!";
		}
		if(idade > 30 && idade < 40) {
			return "Trabalho bastante ainda, porém estou errando menos";
		}
		if(idade > 40 && idade < 60) {
			return "Meu ritimo caiu muito, porém me tornei sabido";
		}
		
		return "Ixi nem trabalho";
		
	}
	

}
