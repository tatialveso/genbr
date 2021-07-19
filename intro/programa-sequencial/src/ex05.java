import java.util.*;

public class ex05 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		double firstGrade, secondGrade, thirdGrade, average;
		
		System.out.println("Informe a primeira nota do estudante:");
		firstGrade = answer.nextDouble();
		System.out.println("Informe a segunda nota do estudante:");
		secondGrade = answer.nextDouble();
		System.out.println("Informe a terceira nota do estudante:");
		thirdGrade = answer.nextDouble();
		
		average = ((firstGrade * 2) + (secondGrade * 3) + (thirdGrade * 5)) / 3;
		
		System.out.println("A média final do estudante é " + average);
	}
}
