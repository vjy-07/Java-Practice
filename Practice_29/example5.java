import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		if(n<=1 || n>=10){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("Before Swapping - ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("After Swappinng - ");
		for(int i=0;i<n-1;i+=2){
		    arr[i]=arr[i]+arr[i+1]-(arr[i+1]=arr[i]);
		}
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }	
	}
}
