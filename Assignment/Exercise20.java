package Assignment;
import java.util.Scanner;


public class Exercise20 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
			throws ArrayIndexOutOfBoundsException
    {
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt(); 
        int arr[] = new int[size];
 
        try {
        	   System.out.println("Enter values");
                for (int i = 0; i < size; i++) {
 
                arr[i] = scanner.nextInt();
            }
                System.out.println("Array at index "+0+" is "+arr[0]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Bounds Exceeded...\nTry Again");
        }

	}

}
