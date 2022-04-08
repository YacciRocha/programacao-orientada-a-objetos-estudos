package poo;

public class ContaBanco {
	
	//Atributos
	
	public String numeroConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// construtores

	public ContaBanco() {

	}

	public ContaBanco(String numeroConta, String tipo, String dono, double saldo, boolean status) {
		this.setSaldo(0);
		this.setStatus(false);
	}
	// metodos
	
	public void estadoAtual() {
		System.out.println("________________________");
		System.out.println(this.getNumeroConta());
		System.out.println(this.getTipo());
		System.out.println(this.getDono());
		System.out.println(this.getSaldo());
		System.out.println(this.getStatus());
	}

	public void abrirConta(String tipoConta) {
		this.setTipo(tipoConta);
		this.setStatus(true);

		if (tipoConta == "CC") {
			this.setSaldo(50);
		} else if (tipoConta == "CP") {
			this.setSaldo(150);
		}
	}	

	public void fecharConta() {	
		if(this.getSaldo() > 0) {
			System.out.println("Conta ainda está com dinheiro");
		}else if(this.getSaldo() < 0) {
			System.out.println("A conta está em débito");
		}else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}

	public void depositar(double valor) {
		if (getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado com sucesso na conta de número: " + this.getNumeroConta());
		} else {
			System.out.println("A conta não existe");
		}
	}

	public boolean sacar(double valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso na conta de número:" + this.getNumeroConta());
			} else {
				System.out.println("Saldo insuficiente");
				return true;
			}

		} else {
			System.out.println("Impossível sacar");
		}
		return false;
	}

	public void pagarMensalidade() {
		int valorMensalidade=0;
		if (this.getTipo() == "CC") {
			valorMensalidade = 12;
		} else if (this.getTipo() == "CP") {
			valorMensalidade = 20;
		}

		if (this.getStatus() == true) {
		 this.setSaldo(getSaldo() - valorMensalidade); 
		 System.out.println("Mensalidade paga");
		 
		}else {
			System.out.println("A conta não existe.");
		}
	}

	// métodos getters and setters - encapsulamento

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
