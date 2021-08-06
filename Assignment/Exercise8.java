package Assignment;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int originalnum, remainder, result = 0;

        originalnum = num;

        while (originalnum != 0)
        {
            remainder = originalnum % 10;
            result += Math.pow(remainder, 3);
             
            originalnum /= 10;
            
            
        }

        if(result == num)
            System.out.println(num + "   armstrong num.");
        else
            System.out.println(num + "   not   armstrong num.");
   

	}

}
