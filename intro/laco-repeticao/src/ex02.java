import java.util.*;

public class ex02 {
	public static void main(String[] args) {		
		
		int number;
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < 10; i++) {
			Scanner answer = new Scanner(System.in);
			System.out.println("Insira um n�mero aleat�rio:");
			number = answer.nextInt();
			
			if(number % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("O total de n�meros pares � de " + even + " n�meros pares");
		System.out.println("O total de n�meros �mpares � de " + odd + " n�meros �mpares");
	}
}
