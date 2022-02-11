package polyinherence.ex01;

public class GetAnimals {
	public static void main(String[] args) {
		Dog doguinho = new Dog();
		
		doguinho.setName("Pingo de Oliveira");
		doguinho.setRun(true);
		
		String name = doguinho.getName();
		boolean run = doguinho.isRun();
		
		System.out.println("O cachorro " + name + " " + run);
	}
}
