package poo;

public class Aula05TesteBanco {

	public static void main(String[] args) {
		
		ContaBanco p1= new ContaBanco();
		p1.setNumeroConta("4584");
		p1.setDono("João");
		p1.abrirConta("CC");
		p1.depositar(300);
		p1.fecharConta();
		
		
		ContaBanco p2= new ContaBanco();
		p2.setNumeroConta("3697");
		p2.setDono("Marruá");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
	
		//exibe os dados no console
		p1.estadoAtual();
		p2.estadoAtual();
	
	}
		
}
