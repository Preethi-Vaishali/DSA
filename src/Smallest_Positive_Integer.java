import java.util.Scanner;

public class Smallest_Positive_Integer {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c=0, small=0;
		System.out.print("Enter the size of array: ");
		int n= s.nextInt();
		int ar[]= new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++)
			ar[i]=s.nextInt();
		for(int i=1; i<=10; i++) {
			c=0;
			for(int j=0; j<n; j++) {
				if(ar[j] ==  i) {
					c=1;
					break;
					}
			}if(c==0) {
				small =i;
				break;
			}
		}
		System.out.println("The smallest positive missing integer is: "+ small);
		s.close();
   }
}
 