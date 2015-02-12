package Feb6;

import java.util.Scanner;

public class NearestPoints2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many points you have : ");
		int size = input.nextInt();

		int myArray[] = new int[size];
		
		// Accepting Array list form the user
		System.out
				.println("Enter " + size + " integers by pressing Enter key ");

		for (int i = 0; i < size; i++) {
			myArray[i] = input.nextInt();
		}
		input.close();

		// Declaring my Variables

		int nearpoint = 0;
		int temp = 0;
		// int num1 = 0;
		// int num2 = 0;
		String Result = "";

		// This nested for loop is to identify the nearest point

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// Avoiding checking wz z same no
				if (!(myArray[i] == myArray[j])) {
					temp = myArray[i] - myArray[j];
					// Converting if the point is -ve to +ve
					if (temp < 0)
						temp *= -1;
					// Checking nearest by including first loop while nearpoint
					// were 0 by default
					if ((nearpoint == 0) || (temp < nearpoint))
						nearpoint = temp;
				}
			}
		}

		// Another nested for loop to display
		// The main Reason for this other loop is to have the nearest of all the
		// nearest
		System.out.println("The Nearest Points Are :");

		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				temp = myArray[i] - myArray[j];
				// Converting if the point is -ve to +ve
				if (temp < 0)
					temp *= -1;

				if (temp == nearpoint) {
					Result += "(" + Integer.toString(myArray[i]) + " , ";
					Result += Integer.toString(myArray[j]) + ") ,";
				}

			}
		}
		System.out.print(Result + " And They are " + nearpoint + " Points Near!");

	}

}
