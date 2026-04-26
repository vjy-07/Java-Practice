import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		if(n<1 || n>10){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k= sc.nextInt();
		if(k<0 || k>=n){
		    System.out.print("Invalid Key Value.");
		    return;
		}
		for(int i=0;i<=k;i++){
		    sum+=arr[i];
		}
		System.out.print(sum);
	}
}
