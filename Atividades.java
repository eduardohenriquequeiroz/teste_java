package primeiro_projeto;

import java.util.Scanner;

public class Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variáveis
		String nome,idade;

		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);

		// Entrada de dados
		System.out.println("Informe o nome: ");
		nome = ler.next();

		System.out.println("Informe a idade: ");
		idade = ler.next();


		//Saída
		System.out.println("O seu nome e idade é : " + nome +" "+ idade);
		ler.close();

	}

}
