import java.util.*;

public class ex04 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int a, b, c;
		double d;
		
		System.out.println("Escolha um valor:");
		a = answer.nextInt();
		System.out.println("Escolha outro valor:");
		b = answer.nextInt();
		System.out.println("Escolha mais um valor:");
		c = answer.nextInt();
		
		d = (((a + b) * (a + b)) + ((b + c) * (b + c))) / 2;
		System.out.println("O valor de d é " + d);
	}
}
