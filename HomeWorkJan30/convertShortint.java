package Jan30;

import java.util.Scanner;

public class convertShortint {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the intiger to Convert :");
		short num = input.nextShort();
	    input.close();
	   
	//     int out1= (int) Short.toUnsignedLong(num);
	    String out= Integer.toBinaryString(num);
		  
	    
	    // System.out.println(df16.format(out1));
	     
	 System.out.println("The Bits are : "+out);
	
		
	}

}
