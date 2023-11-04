import java.util.Scanner;

public class Sorting_using_Bubble_sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t;
		//System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[] = new int[n+1];
		//System.out.print("Enter the array elements one by one: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		for(int step =0; step<n-1; step++) {
			for(int i=0; i<n-1; i++) {
				if(arr[i]>arr[i+1]) {
					t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] =t;
				}
			}
		}
		//System.out.println("Array after Sorting: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();
	}

}
