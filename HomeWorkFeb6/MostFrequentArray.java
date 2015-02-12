package Feb6;

import java.util.Scanner;

public class MostFrequentArray {

	public static void main(String[] args) 
	{
		// Receive The Array Size from the user
		Scanner input = new Scanner(System.in);
		System.out
				.print("Enter The Array Size you want check the frequency : ");
		int size = input.nextInt();

		int myArray[] = new int[size];
		System.out
				.println("Enter " + size + " integers by pressing Enter key ");
	
		for (int i = 0; i < size; i++) {
			myArray[i] = input.nextInt();
		}
		input.close();

		//Declaring Variables
		
		int freq = 0;
		int currentfreq = 0;
		int mostfreq = 0;

		//Looping to check the frequency 
		
		for (int x = 0; x < size; x++) 
		{
			for (int temp : myArray) 
			{
				if (myArray[x] == temp)
					currentfreq++;
			}
			if (currentfreq > freq) 
			{
				mostfreq = myArray[x];
				freq = currentfreq;
			}
			currentfreq = 0;
		}

		System.out.println("The Number With the highest Frequency is : "
				+ mostfreq + " ( " + freq + " Times)");

	}

}
