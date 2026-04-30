import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int h1= Integer.MIN_VALUE;
		int h2= Integer.MIN_VALUE;
		if(n<=1){
		    System.out.print("Invalid array size.");
		    return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(arr[i]>h1){
		        h2=h1;
		        h1=arr[i];
		    }
		    else if(arr[i]>h2 && arr[i]<h1){
		        h2=arr[i];
		    }
		}
		System.out.print(h2);
	}
}
