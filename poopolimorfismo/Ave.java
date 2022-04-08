package poopolimorfismo;

public class Ave extends Animal {
		
	private String corPena;
	
	public void fazerNinho() {
		System.out.println("Fez um ninho");
		
	}
	
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de aves");
	}
	

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
