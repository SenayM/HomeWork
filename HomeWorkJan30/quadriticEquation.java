package Jan30;

import java.util.Scanner;

public class quadriticEquation 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quadratic equation Solver\n \nEnter the value for A : ");
		double a = input.nextDouble();
		System.out.println("\n Enter the value for B : ");
		double b = input.nextDouble();
		System.out.println("\n Enter the value for C : ");
		double c = input.nextDouble();
		input.close();

		double temp = Math.sqrt(b * b - 4 * a * c);
		double root1 = ( -b + temp) / (2*a);
		double root2 = ( -b -temp) / (2*a);
		
		if (temp > 0)
		    {
		    	System.out.println( "the equation has two real roots" +"\n"+" the roots are : "+  root1+" and " +root2);
		    }
		    else if(temp ==0) 
		    {
		    	System.out.println("the equation has one root"+  "\n"+ " The root is :  " +(-b /2 * a));
		    }
		    else
		    {
		    	System.out.println("the equation has no real roots !!!");
		    }


		
	}

	
}


