import java.util.Scanner;

public class Segregate0s_and_1s_in_an_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Enter the size of the array: ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter array elements: ");
		for(int i =0; i<n; i++)
			a[i] = s.nextInt();
		for(int i=0; i<n; i++) {
			if(a[i]==0) {
				for(int j=0; j<n; j++) {
					System.out.println(a[i]+", "); 
				}
			}
		}
		
		
	}
}
