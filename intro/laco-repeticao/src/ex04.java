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
			
			System.out.println("Qual seu g�nero? Digite 1 para feminino, 2 para masculino e 3 para n�o-bin�rio.");
			gender = answer.nextInt();
			
			System.out.println("Digite 1 se voc� � uma pessoa calma; 2 se � nervosa; 3 se � uma pessoa agressiva.");
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
		
		System.out.println("O n�mero de pessoas calmas s�o: " + peopleCalm);
		System.out.println("O n�mero de mulheres nervosas s�o: " + nervousWomen);
		System.out.println("O n�mero de homens agressivos s�o: " + agressiveMen);
		System.out.println("O n�mero de n�o-bin�rios calmos s�o: " + calmNb);
		System.out.println("O n�mero de pessoas nervosas acima dos 40 anos s�o: " + overNervousPeople);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos s�o: " + underCalmPeople);
	
		answer.close();
	}
}
