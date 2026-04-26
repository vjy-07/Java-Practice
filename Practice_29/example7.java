import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		if(n<1){
		    System.out.print("InvALId ArrAy SIze.");
		    return;
		}
		int s=0,e=n-1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("Given Array Elements - ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse Array Elements - ");
		for(int i=0;i<n;i++){
		    while(s<e){
		        arr[s]=arr[s]+arr[e]-(arr[e]=arr[s]);
		        s++;
		        e--;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
