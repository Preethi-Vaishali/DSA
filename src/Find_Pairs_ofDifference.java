import java.util.Scanner;

public class Find_Pairs_ofDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,k,e=0,o=0, count =0;
		System.out.print("Enter the size of the array: ");
		n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		System.out.print("Enter array elements: ");
		for(int i =0; i<n; i++)
			a[i] = s.nextInt();
		System.out.print("Enter the no. of difference: ");
		k = s.nextInt();
		for(int i =0; i<=n-1; i++) {
			for(int j=i+1; j<=n-1; j++) {
				if(Math.abs(a[i]-a[j]) == k) {
					count++;
					b[e++]=a[i];
					c[o++]=a[j];
					
				}
			}
		}
		System.out.println("Output should be: "+ count);
		System.out.println("Pairs can be: ");
		for(int i=0; i<e; i++) {
			System.out.println(b[i]+", "+ c[i]);
}
		s.close();}

}
