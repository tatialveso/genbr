import java.util.*;

public class ex01 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Escolha os valores de tr�s n�meros:");
		a = answer.nextInt();
		b = answer.nextInt();
		c = answer.nextInt();
		
		if(a > b && a > c) {
			System.out.println("O maior n�mero � " + a);
		} else if(b > a && b > c) {
			System.out.println("O maior n�mero � " + b);
		} else if(c > a && c > b) {
			System.out.println("O maior n�mero � " + c);
		}
		
	}
}
