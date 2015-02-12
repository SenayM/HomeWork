package Homework;

import java.util.Scanner;

public class gallonLiterConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput= new Scanner(System.in);

		System.out.print("Enter The Gallon : ");
		double galon = userInput.nextInt();
		userInput.close();
		double liter= galon*3.7854;
		System.out.println(galon+" Gallon will be : " + liter+" Liters");



	}

}
