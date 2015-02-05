package Jan30;

import java.util.Scanner;

public class notDivisbleby3and7 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Maximum number you want to Check :");
		int n = input.nextInt();
	    input.close();
	for (int i=1;i<=n;i++)
	{
		if (!((i%3==0)||(i%7==0)))
			System.out.println(i +" Is not Divisble by 3 or 7");
	}
	}

}
