import java.util.*;

public class ex04 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		double number, sqrt, power;
		System.out.println("Escolha um n�mero qualquer:");
		number = answer.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Este n�mero � par");
			sqrt = Math.sqrt(number);
			System.out.println("A raiz quadrada deste n�mero � " + sqrt);
		} else {
			System.out.println("Este n�mero � �mpar");
			power = number * number;
			System.out.println("O n�mero elevado ao quadrado � " + power);
		}
	}
}
