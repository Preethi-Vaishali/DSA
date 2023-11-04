import java.util.Scanner;

public class Permute_by_n_Times {
	
	static void rotateN(int arr[], int n, int rot) {
		
		for (int r=0; r<rot; r++) {
		int x = arr[n-1];
			for (int i=n-1; i>0; i--)
				arr[i]=arr[i-1];
			arr[0]= x;
			
	}
	}
	static void antiRot(int arr[], int n, int rot) {
			for (int r=0; r<rot; r++) {
				int x = arr[0];
					for (int i=1; i<n; i++) {
						arr[i-1]=arr[i];
					}
					arr[n-1]= x;
					
			}		
	}
	static void displayN(int arr[], int n) {
		System.out.println("The contents of the array after rotation are: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
	}
	static void displayAnti(int arr[], int n) {
		System.out.println("The contents of the array after rotation are: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
	}

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int n;
				System.out.print("Enter the size of the array ");
				n = s.nextInt();
				int arr[] = new int[n];
				System.out.print("Enter array elements ");
				for(int i =0; i<n; i++)
					arr[i] = s.nextInt();
				System.out.print("The contents of the array before rotation are: ");
				for(int i =0; i<n; i++)
					System.out.print( arr[i]+" ");
				System.out.println();
				System.out.print("Enter the number of rotation: ");
				int rot = s.nextInt();
				//rotateN(arr,n,rot);
				//displayN(arr,n);
				antiRot(arr,n,rot);
				displayAnti(arr,n);			
				s.close();
				

			}

}
