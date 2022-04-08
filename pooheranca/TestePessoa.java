package pooheranca;

public class TestePessoa {

	public static void main(String[] args) {
		
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");		
		p2.setSexo("Feminino");		
		p2.setIdade(18);		
		
		System.out.println(p2.toString());
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		
		Visitante v1 = new Visitante();
		Aluno a1= new Aluno();
		Bolsista b1= new Bolsista();
		Tecnico t1=new Tecnico();
		
		v1.setNome("João");
		a1.setNome("Claudio");
		a1.setMatricula(1519);
		
		System.out.println(a1.toString());
		
		System.out.println(v1.toString());
	}
}
