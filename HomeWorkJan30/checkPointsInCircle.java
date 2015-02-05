package Jan30;

import java.util.Scanner;

public class checkPointsInCircle {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter point x of the circle: "); 
		int x = input.nextInt(); 

		System.out.print("Enter point x of the circle: "); 
		int y = input.nextInt(); 
		input.close();

		double distance=Math.sqrt(x*x + y*y);
		
		if (distance<=10)
			System.out.println("Point "+ x+" And "+ y +" Are within the circle of radius 10" );
		else
			System.out.println("Point " +x+" And "+ y +" Are not within the circle of radius 10" );
		
		} 

		

	}


