package Jan30;

import java.util.Scanner;

public class stringRiverser {

	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
		    
		    // Prompt the user to enter The word
		    System.out.print("Enter the word you want to Riverse : ");
		    String  word = input.nextLine();
		    input.close();
		    String newword="";
	
		    int size= word.length();
		  	   
		    for (int i=(size-1); i>=0;i--)
			   {
			   newword += word.charAt(i);
			   }
		    System.out.println("What you type is :"+word+ "\nAnd the Reverse is :"+newword ); 
	}

}
