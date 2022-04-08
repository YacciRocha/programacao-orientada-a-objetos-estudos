package poo;

public class ControleRemoto implements Controlador {

	// atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// método construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// método especiais get and set
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// métodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.getLigado() == true) {
			System.out.println("----M E N U ----");
			System.out.println("Está ligado?" + this.getLigado());
			System.out.println("Está tocando?" + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i += 10) {
				System.out.print("|");
			}
			System.out.println("");
		} else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

	@Override
	public void fecharMenu() {
		if (this.getLigado() == true) {
			System.out.println("Fechando Menu.");
		} else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}

	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("A tv está desligada, as funções do controle não podem ser acessadas.");
		}
	}

}
