package pooheranca;

public class Bolsista extends Aluno{

	private double  bolsa;
	
	
	public void renorvarBolsa() {
		System.out.println("Renovando bolsa de " +  this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + "é bolsista, pagamento facilitado");
	}
	
	
	
}
