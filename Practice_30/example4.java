import java.util.*;
class Main
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Array Size.");
            return;
        }
        
        int arr[] = new int[n];
        int h = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>h){
                h=arr[i];
            }
        }
        System.out.print(h);
	}
}
