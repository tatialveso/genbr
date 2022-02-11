import java.util.*;

public class ex03 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int age;
		
		System.out.println("Quantos anos você tem?");
		age = answer.nextInt();
		
		if(age >= 10 && age < 15) {
			System.out.println("Você tem entre 10 e 14 anos, sua categoria é infantil");
		} else if(age >= 15 && age < 18) {
			System.out.println("Você tem entre 15 e 17 anos, sua categoria é juvenil");
		} else if(age >= 18 && age < 26) {
			System.out.println("Você tem entre 18 e 25 anos, sua categoria é adulto");
		} 
	}
}
