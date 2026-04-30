import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr1[]=new int[n];
		for(int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
		int n1 = sc.nextInt();
		if(n1<=0){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr2[]=new int[n1];
		for(int i=0;i<n1;i++){
		    arr2[i]=sc.nextInt();
		}
		int h = n>n1?n:n1;
		for(int i=0;i<h;i++){
		    if(i<n && i<n1){
		        System.out.print(arr1[i]+arr2[i]+" ");
		    }
		    else if(i<n){
		        System.out.print(arr1[i]+" ");
		    }
		    else{
		        System.out.print(arr2[i]+" ");
		    }
		}
	}
}
