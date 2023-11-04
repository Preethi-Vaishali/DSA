import java.util.Scanner;
public class Star_SuperStar {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
		        int N = sc.nextInt();
		        int star[]=new int[N];
		        int superstar[]=new int[N];
		        int count,element,index=0,index1=0;
		        int[] arr = new int[N];

		        for (int i = 0; i < N; i++) {
		            arr[i] = sc.nextInt();
		        }
		        
		        for(int i=0;i<N;i++) {
		        	count=0;
		        	element=0;
		        	if(i==0) {
		        		for(int j=1;j<N;j++) {
		        			if(arr[i]<arr[j]) {
		        				count++;
		        				break;	
		        			}
		        			}
		        		if(count==0) {
		        			star[index++]=arr[i];
		        			superstar[index1++]=arr[i];
		        		}
		        		count=0;
		        		}
		        	else if(i==N-1) {
		        		star[index++]=arr[N-1];
		        		for(int j=N-2;j>=0;j++) {
		        			if(arr[i]<arr[j]) {
		        				count++;
		        				break;
		        			}
		        		}
		        		if(count==0) {
		        			superstar[index1++]=arr[i];
		        		}
		        		count=0;
		        	}
		        	else {
		        			for(int x = i+1;x<N;x++) {
		        				if(arr[i]<arr[x]) {
		        					element++;
		        					break;
		        				}
		        			}
		        			if(element==0)
		        				star[index++]=arr[i];
		        			for(int y=i-1;y>=0;y--) {
		        				if(arr[i]<arr[y]) {
		        					count++;
		        					break;
		        				}
		        				}
		        			if(element==0 && count==0)
		        				superstar[index1++]=arr[i];
		        			element=0;
		        			count=0;
		        	}
		        }
		        for(int i=0;i<index;i++) {
		        	System.out.print(star[i]+" ");
		        }
		        System.out.println();
		        for(int i=0;i<index1;i++)
		        	System.out.print(superstar[i]+" ");
		     //   System.out.println();
		       
sc.close();
	}

}
