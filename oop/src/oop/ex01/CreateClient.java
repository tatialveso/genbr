package oop.ex01;

public class CreateClient {
	public static void main(String[] args) {
		Client cli = new Client();
		
		cli.setName("Amanda");
		cli.setAge(23);
		
		String name = cli.getName();
		int age = cli.getAge();
		
		System.out.println("Meu nome é " + name + " e tenho " + age + " anos.");
		
	}
}
