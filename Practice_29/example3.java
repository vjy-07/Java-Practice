import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		if(n<5){
		    System.out.print("InValid Array Size.");
		    return;
		}
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]%2==1){
		        sum+=arr[i];
		    }
		}
		if(sum==0) System.out.print("No Odd Numbers.");
		else System.out.print(sum);
	}
}
