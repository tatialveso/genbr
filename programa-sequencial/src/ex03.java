import java.util.*;

public class ex03 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		int total = 0;
		int totalInHours = 0;
		int totalInMinutes = 0;
		int totalInSeconds = 0;
		
		
		System.out.println("Quantos segundos tem este evento?");
		total = answer.nextInt();
		
		totalInHours = total / 3600;
		totalInMinutes = (total / 60);
		totalInSeconds = total % 60;
		
		System.out.println("Este evento tem " + totalInHours + " horas, " + totalInMinutes + " minutos e " + totalInSeconds + " segundos no total.");
	}
}
