import java.util.Scanner;

public class Sum_and_avg {
	static void sumAndAvg(int arr[], int n) {
		int sum=0;
		for(int i=0; i<n; i++) {
			sum += arr[i];	
		}
		System.out.println("Sum: "+sum);
		
		double avg;
		avg = (double)sum/n;
		System.out.println("Average: "+avg);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of elements you want in array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter all the elements: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		sumAndAvg(arr,n);
		s.close();
		
	}

}
