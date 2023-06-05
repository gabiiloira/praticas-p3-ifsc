package continuacao9;

import exercicio9.Pessoa;

public class PessoaMainA{
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.cpf = 1233452024l;
		p.nome = "Gabrieli";
		p.data = "24/06/2005";
		
		System.out.println("A pessoa "
				+ p.nome + " tem o CPF n° " + p.cpf + " e nasceu no dia " + p.data);
		System.out.println("====================================================================");
		
		p.cpf = 987654321l;
		p.nome = "Gabriely";
		p.data = "08/01/2006";
		
		System.out.println("A pessoa "
				+ p.nome + " tem o CPF n° " + p.cpf + " e nasceu no dia " + p.data);
		System.out.println("====================================================================");
		
		p.cpf = 647429200636l;
		p.nome = "Amanda";
		p.data = "04/06/2005";
		
		System.out.println("A pessoa "
				+ p.nome + " tem o CPF n° " + p.cpf + " e nasceu no dia " + p.data);
		System.out.println("====================================================================");
		
		p.cpf = 546382902024l;
		p.nome = "Lara";
		p.data = "09/01/2006";
		
		System.out.println("A pessoa "
				+ p.nome + " tem o CPF n° " + p.cpf + " e nasceu no dia " + p.data);
		System.out.println("====================================================================");
		
		p.cpf = 487454875588l;
		p.nome = "Vitória";
		p.data = "24/10/2005";
		
		System.out.println("A pessoa "
				+ p.nome + " tem o CPF n° " + p.cpf + " e nasceu no dia " + p.data);
		System.out.println("====================================================================");
	}
}