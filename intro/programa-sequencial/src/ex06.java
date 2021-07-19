import java.util.*;

public class ex06 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		double d;
		
		System.out.println("Escolha um valor para representar o eixo X de um ponto:");
		x1 = answer.nextInt();
		System.out.println("Agora escolha um valor para ser o eixo Y desse ponto:");
		y1 = answer.nextInt();
		
		System.out.println("Escolha um valor para representar o eixo X de outro ponto:");
		x2 = answer.nextInt();
		System.out.println("Agora escolha um valor para ser o eixo Y desse outro ponto:");
		y2 = answer.nextInt();
		
		d = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.println("A distância entre os pontos é de " + d);
	}
}
