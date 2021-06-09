import java.util.*;

public class ex04 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		double number, sqrt, power;
		System.out.println("Escolha um número qualquer:");
		number = answer.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Este número é par");
			sqrt = Math.sqrt(number);
			System.out.println("A raiz quadrada deste número é " + sqrt);
		} else {
			System.out.println("Este número é ímpar");
			power = number * number;
			System.out.println("O número elevado ao quadrado é " + power);
		}
	}
}
