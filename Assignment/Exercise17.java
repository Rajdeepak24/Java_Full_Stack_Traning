package Assignment;
import java.util.*;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	} 

public class Exercise17 {
	
	static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try{  
	    	  Scanner scanner= new Scanner(System.in);
	    	  System.out.println("Enter age: ");
	    	  int age =scanner.nextInt();
	    	  validate(age);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
		 

	}

}
