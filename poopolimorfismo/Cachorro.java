package poopolimorfismo;

public class Cachorro extends Lobo {

//	public void enterrarOsso() {
//		System.out.println("Enterrou o osso");
//	}
//
//	public void abanarRabo() {
//		System.out.println("Abanou o  rabo");
//
//	}

	public void reagir(String frase) {

		if (frase.equals("Toma comida") || frase.equals("Olá")) {
			System.out.println("Abanar o rabo de latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int minuto) {

		if (hora < 12) {
			System.out.println("Abanar o rabo");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar o rabo e latir");
		}

	}

	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar o rabo");
		} else {
			System.out.println("Rosnar e latir");
		}
	}

	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar o rabo");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
		}

	}

	@Override
	public void emitirSom() {
		System.out.println("Au-au-au");
	}
}
