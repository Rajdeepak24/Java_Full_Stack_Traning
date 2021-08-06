package Assignment;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) 
		{
			int s = a*a*a;
			System.out.print(s + " ");
			a++;
			
		}

	}

}
