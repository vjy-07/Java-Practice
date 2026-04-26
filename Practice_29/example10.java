import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		if(n<=0){
		    System.out.print("Invalid ArRay Size.");
		    return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    sum+=arr[i];
		}
		System.out.print("Average of Given Array Elements is ");
		System.out.printf("%.5f",(float)sum/n);
		System.out.print(".");
	}
}
