import java.util.*;

public class ex06 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int number;
		int sum = 0;
		double avg = 0;
		int countNumbers = 0;
		
		do {
			System.out.println("Insira um número inteiro");
			number = answer.nextInt();
			
			if(number % 3 == 0) {
				sum += number;
				countNumbers++;
			}
		} while (number != 0);
		
		avg = sum / countNumbers;
		System.out.println("A média de valores múltiplos de 3 é: " + avg);
	}
}
