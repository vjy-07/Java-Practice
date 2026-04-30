import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int l =Integer.MAX_VALUE;
		if(n<=0){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(arr[i]<l){
		        l=arr[i];
		    }
		}
		System.out.print(l);
	}
}
