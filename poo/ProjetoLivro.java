package poo;

import pooheranca.Pessoa;

public class ProjetoLivro {
	
	public static void main(String[] args) {
		
		Pessoa [ ] pessoa= new Pessoa[2];
		Livro [] livro = new Livro[3];
 				
		
		//pessoa[0] = new Pessoa("Pedro", 22, "Masculino");
		//pessoa[1]= new Pessoa("Maria", 25, "Feminino");
		
		livro[0]= new Livro("Aprendendo Java" ,"José das Couves", 300, pessoa[0]);
		livro[1]= new Livro("POO aplicado a Java" ,"João dos Tomates", 600, pessoa[1]);
		livro[2]= new Livro("Inglês básico" ,"Aurélio Reis", 450, pessoa[0]);
		
		
		livro[0].abrir();
		livro[0].folhear(100);
		livro[0].avancarPagina();
		
		livro[1].abrir();
		livro[1].folhear(100);
		livro[1].voltarPagina();
		
		System.out.println(livro[0].detalhes());
		System.out.println("--------------------------------------------");
		System.out.println(livro[1].detalhes());
	}
}
