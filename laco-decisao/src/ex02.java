import java.util.*;

public class ex02 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite tr�s n�meros aleat�rios:");
		a = answer.nextInt();
		b = answer.nextInt();
		c = answer.nextInt();
		
		if(a <= b && b <= c) {
			System.out.println("A ordem crescente � " + a + ", " + b + " e " + c);
		} else if(c <= b && b <= a) {
			System.out.println("A ordem crescente � " + c + ", " + b + " e " + a);
		} else if(b <= c && c <= a) {
			System.out.println("A ordem crescente � " + b + ", " + c + " e " + a);
		} else if(c <= a && a <= b) {
			System.out.println("A ordem crescente � " + c + ", " + a + " e " + b);
		} else if(a <= c && c <= b) {
			System.out.println("A ordem crescente � " + a + ", " + c + " e " + b);
		} else if(b <= a && a <= c) {
			System.out.println("A ordem crescente � " + b + ", " + a + " e " + c);
		}
	}
}
