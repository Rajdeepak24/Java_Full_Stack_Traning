package Assignment;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int [] {1,4,9,3,6,8};
		int max = 0;
		for(int i = 0; i<a.length; i++) {
			//System.out.println(a[i]);
			 
			 max = a[i] + max;
			}
		System.out.println(max);

	}

}
