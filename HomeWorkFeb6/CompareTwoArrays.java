package Feb6;

import java.util.Scanner;

public class CompareTwoArrays
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter The Sizes of the two array : "); 
		int size = input.nextInt(); 
		
		//Declaring the two arrays and string
		int firstArray[]=new int[size];
		int secondArray[]=new int[size];
		String compare= "Identical";
		
		
		System.out.println("Enter "+size+" Members of the First Array ");
		
		//Accept the First array from the user
		
		for (int i=0;i<size;i++)
			{
			firstArray[i]=input.nextInt();
			}
		
		//Accept the second array from the user
		
		System.out.println("Enter "+size+" Members of the Second Array ");
		for (int i=0;i<size;i++)
			{
			secondArray[i]=input.nextInt();
			}
		input.close();
		
		//Checking for Identicality 
		
		for (int y=0;y<size;y++)
			if (!(firstArray[y]==secondArray[y]))
			{ compare="Not Identical";
			break;
			}
	 
		System.out.println("The Contents of the Two Array are "+compare);
	}

}
