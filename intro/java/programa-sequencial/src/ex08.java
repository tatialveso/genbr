import java.util.*;

public class ex08 {
	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		
		double consumerCost, factoryCost, distributorPercent, taxes;
		
		System.out.println("Qual � o valor do custo de f�brica do carro?");
		factoryCost = answer.nextDouble();
		
		distributorPercent = factoryCost + (factoryCost * 0.28);
		taxes = factoryCost + (factoryCost * 0.45);
		
		consumerCost = factoryCost + distributorPercent + taxes;
		
		System.out.println("O valor de custo do carro para o consumidor � de " + consumerCost);

	}
}
