import java.util.*;
public class ex0102 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
				
		int age = 0;
		int ageInDays = 0;
		int ageInMonths = 0;
		
		System.out.println("Quantos anos voc� tem?");
		age = answer.nextInt();
		
		ageInDays = age * 365;
		ageInMonths = age * 12;

		System.out.println("Voc� possui " + age + " anos de vida");
		System.out.println("Voc� possui " + ageInMonths + " meses de vida");
		System.out.println("Voc� possui " + ageInDays + " dias de vida");
	}
}
