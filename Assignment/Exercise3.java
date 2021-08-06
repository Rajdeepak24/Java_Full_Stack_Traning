package Assignment;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all three horse weight");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a==b) {
			System.out.println("weight of  a and b is same");
		}
		else if(b==c) {
			System.out.println("weight of  b and c is same");
		}
		else if(c==a) {
			System.out.println("weight of  c and a is same");
		}
		if(a>b && b>c) {
			System.out.println("weight of  a is maximun");
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
		}
		if(b>c && c>a) {
			System.out.println("weight of  b is maximun");
		}
		
		if(c>a && c>b) {
			System.out.println("weight of  c is maximun");
		}


	}

}
