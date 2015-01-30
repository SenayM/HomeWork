package Homework;

import java.util.Scanner;

public class ageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput= new Scanner(System.in);

		System.out.print("How Old Are You : ");
		int cAge = userInput.nextInt();
		userInput.close();
		cAge +=10;
		System.out.println("\nAfter 10 Years You will be : " + cAge);

	}

}
