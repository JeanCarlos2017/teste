package Polimorfismo1;

public class Preguica1 extends Animal1 {

	public Preguica1() {
		super("Flash", 3, "N�o emite som", "subir em �rvores");
		
	}


	@Override
	public void emitirSom() {
		System.out.println("Este animal n�o emite som");		
	}

}
