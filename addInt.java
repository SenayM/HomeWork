package Homework;


import java.util.Scanner;



public class addInt {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner userInput= new Scanner(System.in);

		System.out.print("Enter intiger between 0 and 1000 : ");
		int num = userInput.nextInt();
		userInput.close();
		//Initialize remender as rem int
		int rem=0;
		//Check if the input is between 0 and 1000
		if ((num < 1000)&& (num>0))
		{
			
			while(num>10)
			{
				rem=rem+ (num%10);
									
				num/=10;
			}
			if (num<10)
				rem+=num;
			System.out.println(" The sum of the Digits  will be : " +rem);

		}
		else
			System.out.println(" Wrong Input : ");
	

	
	}

}
