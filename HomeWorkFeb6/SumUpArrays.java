package Feb6;

import java.util.Scanner;

public class SumUpArrays {

	public static void main(String[] args) {
		/*
		 * Write a program which, given an array of integers and another integer
		 * S, finds in the array a contiguous subsequence that sums to S (if
		 * such exists). Example: {4, 3, 1, 4, 2, 5, 8}, S=11. Result: {4, 2,
		 * 5}.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Sizes of the array : ");
		int size = input.nextInt();

		int myArray[] = new int[size];
		
		// Accept array list from the user
		
		System.out.println("Enter " + size + " Members of the Array ");
		for (int i = 0; i < size; i++) {
			myArray[i] = input.nextInt();
		}
		System.out
				.println("Enter the intiger S which you want to check if its sum exist in the list.");
		int s = input.nextInt();
		input.close();

		// Declaring variables //String result= "Doesn't Exist";
		
		String found = "No";
		int sum = 0;
		
		for (int i = 0; i < size; i++)
		{ 
			// if(!(result=="Exist!!")&&(myArray[i]<s))

			if (myArray[i] < s)
				for (int j = i; j < size; j++) 
				{
					if (sum < s)
						sum += myArray[j];
					else if (sum == s) 
					{
						System.out
								.println("The Sum in the list Exists, Result :");
						for (int z = i; z < j; z++)
							System.out.println(myArray[z]);
						// result="Exist!!";
						found = "Yes";
						break;
					} 
					else 
					{ // since sum is more than s we should break the
								// loop
						sum = 0;
						break;
					}
				}
			// Reseting  Sum to check if another sum exist
			sum = 0;
			// result="Reset";
		}

		// Checking if we dont have A result, two conditions because i use
		// result variables for two things
		if (found == "No")
			System.out.println("There is no result in the list");

	}
}
