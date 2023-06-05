package exercicio11;

import exercicio9.Pessoa;
import java.util.Scanner;

import java.util.Scanner;

import ifsc.Pessoa;

public class PessoaMainB{
	
	public static void main(String [] args ){
		
		Scanner leitura = new Scanner(System.in);
		
		Pessoa [] pessoas = new Pessoa[3];
		
		
		for (int i = 0; i < pessoas.length; i++) {
			
			Pessoa p = new Pessoa();
			
			System.out.println("Informe seu nome:");
			p.nome = leitura.nextLine();
			System.out.println("Informe o seu cpf:");
			p.cpf = leitura.nextLine();
			System.out.println("Informe a sua data de nascimento:");
			p.data = leitura.nextLine();
			
			pessoas[i] = p;
		}
			
		for (int i = 0; i < pessoas.length; i++) {
			
			System.out.println("A " + pessoas[i].nome + " posuindo o CPF " + pessoas[i].cpf + " e nasceu no dia " + pessoas[i].data);	
		}
		
		}	
}