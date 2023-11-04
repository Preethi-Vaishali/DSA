import java.util.Scanner;

public class Permute_the_Array {
	static void rotateArray(int arr[], int n) {
		int temp;
		for(int i =0; i<n-1; i++) {
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] =temp;
			}
			
	}
	static void printElement(int arr[], int n) {
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array elements ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		rotateArray(arr,n);
		printElement(arr,n);
		s.close();

	}

}
