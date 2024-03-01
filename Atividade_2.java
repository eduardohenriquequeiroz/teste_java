package primeiro_projeto;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //Variáveis
		Double horatrab,valorhora,salbruto,salliquido,inss;
		//Instaciar classe Scanner
				Scanner ler = new Scanner (System.in);

				// Entrada de dados
				System.out.println("Informe a horatrab: ");
				horatrab = ler.nextDouble();

				System.out.println("Informe o valorhora: ");
				valorhora = ler.nextDouble();
				
				//Processamento
				salbruto = horatrab * valorhora;
				inss = salbruto * 0.12;
				salliquido = salbruto-inss;
				
				//Saída
				System.out.println("O valor do salbruto é : " + salbruto);

				System.out.println("O valor do salliquido é : " + salliquido);
				


	}

}
