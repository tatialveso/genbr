import java.util.*;

public class ex05 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		int number;
		int sum = 0;
		
		do {
			System.out.println("Digite um número:");
			number = answer.nextInt();
			
			sum += number;
		} while (number != 0);
		
		System.out.println("A soma de número digitados é:" + sum);
		answer.close();
	}
}
