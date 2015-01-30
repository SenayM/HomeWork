package Homework;

import java.time.LocalDateTime;

public class currentDT {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LocalDateTime current= LocalDateTime.now();
		
		 System.out.println("The Current Date :"+ current.getDayOfMonth() +"/"+ 
		current.getMonthValue()+ "/"+current.getYear()+ "\n The Current Time is :"+
				 current.getHour()+ ":"+ current.getMinute()); 
			

	}

}
