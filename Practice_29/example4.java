import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int c=0;
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]%2==0){
		        System.out.print(arr[i]+" ");
		        c++;
		    }
		}
		if(c==0){
		    System.out.print("No Even Numbers.");
		}
	}
}
