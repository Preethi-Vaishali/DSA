import java.util.Scanner;

public class To_Check_Equal_Matrix {

	public static void main(String[] args) {
		int col1,row1, col2, row2, count=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter number of row1:");
		row1=s.nextInt();
		System.out.print("Enter number of col1:");
		col1=s.nextInt();
		System.out.print("Enter number of row2:");
		row2=s.nextInt();
		System.out.print("Enter number of col2:");
		col2=s.nextInt();
		if(row1==row2 && col1==col2) {
		int a[][]=new int[row1][col1];
		int b[][]=new int[row2][col2];
		System.out.println("Enter the A matrix:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the B matrix:");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				if(a[i][j]!=b[i][j]) {
					count++;
					break;
				}
			}
		}
		if (count==0)
			System.out.println("Both Matrix are same");
		else
			System.out.println("Both Matrix are not same");
			}
		else
			System.out.println("Rows and Columns of the matrices are not equal");
		s.close();

	}

}

