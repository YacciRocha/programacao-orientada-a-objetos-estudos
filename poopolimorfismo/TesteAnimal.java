package poopolimorfismo;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
//	Mamifero m =new Mamifero();
//	Reptil r= new Reptil();
//	Peixe p = new Peixe();
//	Ave a=new Ave();
//	
//	Canguru canguru = new Canguru();
//	Cobra piton=new Cobra();
//	Tartaruga tuga= new Tartaruga();
//	Goldfish peixe = new Goldfish();
//	Arara arara= new Arara();
	
	Cachorro cao =new Cachorro();
	
	cao.reagir("Olá");
	cao.reagir("Vai apanhar");
	cao.reagir(11, 45);
	cao.reagir(21, 00);
	cao.reagir(true);	
	cao.reagir(false);
	cao.reagir(2, 12.5f);
	cao.reagir(17, 4.5f);
	
	
	

	}
}
