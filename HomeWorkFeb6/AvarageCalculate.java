package Feb6;

import java.util.Scanner;

public class AvarageCalculate {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 Numbers of Array : ");
		int myArray[] = new int[10];
		for (int i = 0; i < 10; i++) 
		{
			myArray[i] = input.nextInt();
		}
		input.close();
		int average = 0;
		
		for (int temp : myArray)
			average += temp;
			average /= 10;
		
		System.out.println("The Average of those 10 Numbers is " + average);
		System.out.print("And the Numbers greaterthan the Average Are :");
		
		for (int x = 0; x < 10; x++)
			if (myArray[x] > average)
				System.out.print(myArray[x] + ",");

	}

}
