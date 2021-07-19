import java.util.*;

public class ex07 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int a, b, c, d, e, f;
		double x, y;
		
		System.out.println("Qual é o valor de a?");
		a = answer.nextInt();
		System.out.println("Qual é o valor de b?");
		b = answer.nextInt();
		System.out.println("Qual é o valor de c?");
		c = answer.nextInt();
		System.out.println("Qual é o valor de d?");
		d = answer.nextInt();
		System.out.println("Qual é o valor de e?");
		e = answer.nextInt();
		System.out.println("Qual é o valor de f?");
		f = answer.nextInt();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("O valor de X é " + x);
		System.out.println("O valor de Y é " + y);
		
	}
}
