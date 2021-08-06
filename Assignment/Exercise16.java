package Assignment;
import java.util.*;

public class Exercise16 {

	  
		
		public static void main(String[] args)
		// TODO Auto-generated method stub
	  {
		  int number;
		  Scanner scanner = new Scanner (System.in);
		  System.out.println("Enter the value: ");
		  number= scanner.nextInt();
		  if(number%8==0 && number%3==0)
		  {
			  System.out.println("Divisible by 8 and 3");
			 
		  }
		  else
			  
			  System.out.println("Not Divisible by 8 and 3");
	  }
	}
	




//package com.techment.assignment;

//
//public class Divisibility {
//  public static void main(String[] args)
//  {
//	  int number;
//	  Scanner scanner = new Scanner (System.in);
//	  System.out.println("Enter the value: ");
//	  number= scanner.nextInt();
//	  if(number%8==0 && number%3==0)
//	  {
//		  System.out.println("Divisible by 8 and 3");
//		 
//	  }
//	  else
//		  System.out.println("Not Divisible by 8 and 3");
//  }
//}
