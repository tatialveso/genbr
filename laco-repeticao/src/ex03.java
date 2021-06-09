import java.util.*;

public class ex03 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int age = 0;
		int under = 0;
		int over = 0;
		
		while(age < 100) {
			System.out.println("Digite qual é a sua idade?");
			age = answer.nextInt();
			
			if(age < 21) {
				under++;
			} else if(age > 50) {
				over++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + under);
		System.out.println("Total de pessoas com mais de 50 anos: " + over);
	}
}
