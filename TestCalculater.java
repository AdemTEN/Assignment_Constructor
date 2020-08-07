package Assignment_Constructor;

import java.util.Scanner;

public class TestCalculater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the cost of carpet:");
		double cost = scan.nextDouble();
		
		System.out.println("Enter the floor witdth and length:");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		Carpet carpet = new Carpet(cost);
		
		Floor floor = new Floor(width,length);
		
		Calculater calc = new Calculater(floor, carpet) ;
		
		System.out.println("The cost of the carpet is: " + calc.getTotalCost());
		

	}

}
