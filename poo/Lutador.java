package poo;

public class Lutador {
	
	//atributos	
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private double altura,peso;
	
	//construtores	
	 public Lutador() {
		 
	 }
	 	 	 
	 public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, 
			int vitorias, int derrotas, int empates) {
		//super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}


	//m�todos p�blicos
	 public void apresentar() {
		 System.out.println("------Chegou a hora! -------");
		System.out.println("Apresentamos o Lutador: " + this.getNome());   
		System.out.println("Diretamente de " + this.getNacionalidade()); 
		System.out.println("Com " + this.getIdade() + " anos e " +this.getAltura() + " m de altura" ); 
		System.out.println("Pesando " + this.getPeso() + "Kg"); 
		System.out.println(this.getVitorias()+ " vit�rias"); 
		System.out.println(this.getDerrotas()+ " derrotas"); 
		System.out.println( this.getEmpates()+ " empates"); 
		
	 }

	 public void status() {
		 System.out.println(getNome() + " � um peso " + getCategoria());
		 System.out.println("Tem " + getVitorias() + " vit�rias");
		 System.out.println("Tem " + getDerrotas() + " derrotas");
		 System.out.println("Tem " + getEmpates() + " empates");
	 }
	 
	 public void ganharLuta() {
		 this.setVitorias(this.getVitorias() + 1);
	 }
	 
	 public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	 }
	 
	 public void empatarLuta() {
		 this.setEmpates(this.getEmpates() + 1);
	 }

	 
	 //encapsulamento
	 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
		
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		 if(this.peso < 52.2) {
			this.categoria="Inv�lido";
		}else if(this.peso <= 70.3) {
			this.categoria="Leve";
		}else if(this.peso <= 83.9) {
			this.categoria="M�dio";
		}else if(this.peso <= 120.2){
			this.categoria="Pesado";
		}else {
			this.categoria="Inv�lido";
		}
	}

	
	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	 
	 
}
