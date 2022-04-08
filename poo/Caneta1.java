package poo;

public class Caneta1 {

	//atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public Caneta1(String modelo, String cor, float ponta, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
	
	public void status(){
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Cor:" + this.cor);
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Carga:" + this.carga);
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	
}
