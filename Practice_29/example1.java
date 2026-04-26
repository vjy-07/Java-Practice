import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int cnt=0;
		
		if(n<=1 || n>=10){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]%2==0){
		        cnt++;
		        if(cnt%2==1){
		            System.out.print(arr[i]+" ");
		        }
		    }
		}
		if(cnt==0){
		    System.out.print("No even numbers in the give Array!");
		}
	}
}
