package oop.ex02;

public class CreatePlane {
	public static void main(String[] args) {
		Plane pl = new Plane();
		
		pl.setCompany("LATAM");
		pl.setDestination("Lisboa");
		pl.setPlaneNumber(234432);
		
		int number = pl.getPlaneNumber();
		String destination = pl.getDestination();
		String company = pl.getCompany();
		
		System.out.println("O voo n�mero " + number + " da companhia " + company + " com destino a " + destination + " sair� em 15 minutos.");
	}
}
