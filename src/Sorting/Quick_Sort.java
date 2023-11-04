package Sorting;

import java.util.Scanner;

public class Quick_Sort {
	/*static void swap(int i, int j) {
		int t=i; 
		i= j;
		j=t;
	}*/
 static int partition (int arr[], int low, int high) {
	 int pivot = arr[high];
	 int i =(low-1), t;
	 for(int j= low; j<=high-1; j++) {
		 if (arr[j]<=pivot) {
			 i++;
			 t=arr[i];
			 arr[i]=arr[j];
			 arr[j]=t;
		 }
	 }
	 t =arr[i+1];
	 arr[i+1] = arr[high];
	 arr[high] = t;
	 return i+1;
 }
 static void quickSort(int arr[], int low, int high) {
	 if(low<high) {
		 int pi = partition(arr,low,high);
		 quickSort(arr,low,pi-1);
		 quickSort(arr,pi+1,high);
		 
	 }
 }
 static void printArray(int arr[], int n) {
	 for(int i=0; i<n; i++) {
		 System.out.print(arr[i]+" "); 
	 }
 }
	public static void main(String[] args) {
		// int arr[] = {10, 7, 8, 9, 1, 5};
		 //int n =arr.length;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] =s.nextInt();
		}
		 quickSort(arr,0,n-1);
		 System.out.println("Sorted Array: ");
		 printArray(arr, n);
		 s.close();
	}

}
