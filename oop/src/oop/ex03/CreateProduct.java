package oop.ex03;

public class CreateProduct {
	public static void main(String[] args) {
		Product prod = new Product();
		
		prod.setName("Smartphone");
		prod.setCompany("Samsung");
		prod.setPrice(2500);
		prod.setBarcode(1234567);
		
		int barcode = prod.getBarcode();
		int price = prod.getPrice();
		String name = prod.getName();
		String company = prod.getCompany();
		
		System.out.println("O produto " + name + " da empresa " + company + " está saindo por R$" + price + ".");
	}
}
