package poopolimorfismo;

public class Peixe extends Animal{
	
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
		
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo substancias");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o emite som");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
