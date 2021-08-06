package Assignment;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of the month");
		int day = sc.nextInt();
		if(day<31) {
			System.out.println("the even day is your you caan ride");
			
		}
		else if(day%2==1) {
			System.out.println("the oddd day is your you caan ride");
			
		}
		
		else if(day%2==0) {
			System.out.println("enter right no");
		}
		
		
 		
		 

	}

}
