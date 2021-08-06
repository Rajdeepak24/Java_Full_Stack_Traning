package Assignment;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		if (year%4==0) {
			System.out.println("Yeppp!! this is leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}

}
