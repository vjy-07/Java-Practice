import java.util.*;
class Main
{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		int c=0;
		if(n<=3){
		    System.out.print("Invalid Array Size.");
		    return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]<=1){
		        System.out.print("Invalid Array Elements");
		        return;
		    }
		}
		for(int i=0;i<n;i++){
		    if(isPrime(arr[i])){
		        sum+=arr[i];
		        c++;
		    }
		}
		if(c==0){
		    System.out.print("No Prime Numbers!");
		}
		else{
		    float avg = (float)sum/c;
		    System.out.print("Average of Prime Numbers in a Given Array Elements is ");
		    System.out.printf("%.3f",avg);
		    System.out.print(".");
		}
	}
}
