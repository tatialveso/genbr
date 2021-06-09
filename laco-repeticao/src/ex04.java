import java.util.*;

public class ex04 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int people = 0;
		int age = 0;
		int gender = 0;
		int behavior = 0;
		int peopleCalm = 0;
		int nervousWomen = 0;
		int agressiveMen = 0;
		int calmNb = 0;
		int overNervousPeople = 0;
		int underCalmPeople = 0;
		
		while(people < 150) {
			System.out.println("Qual a sua idade?");
			age = answer.nextInt();
			
			System.out.println("Qual seu gênero? Digite 1 para feminino, 2 para masculino e 3 para não-binário.");
			gender = answer.nextInt();
			
			System.out.println("Digite 1 se você é uma pessoa calma; 2 se é nervosa; 3 se é uma pessoa agressiva.");
			behavior = answer.nextInt();
			
			if(behavior == 1) {
				peopleCalm++;
			}
			
			if(behavior == 2 && gender == 1) {
				nervousWomen++;
			}
			
			if(behavior == 3 && gender == 2) {
				agressiveMen++;
			}
			
			if(behavior == 1 && gender == 3) {
				calmNb++;
			}
			
			if(behavior == 2 && age > 40) {
				overNervousPeople++;
			}
			
			if(behavior == 1 && age < 18) {
				underCalmPeople++;
			}
			
			people++;
		}
		
		System.out.println("O número de pessoas calmas são: " + peopleCalm);
		System.out.println("O número de mulheres nervosas são: " + nervousWomen);
		System.out.println("O número de homens agressivos são: " + agressiveMen);
		System.out.println("O número de não-binários calmos são: " + calmNb);
		System.out.println("O número de pessoas nervosas acima dos 40 anos são: " + overNervousPeople);
		System.out.println("O número de pessoas calmas com menos de 18 anos são: " + underCalmPeople);
	
		answer.close();
	}
}
