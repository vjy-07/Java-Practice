import java.util.*;
class Main
{
public static void main(String[]args)
{

    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    if(n<=1 || n>=10){
        System.out.print("Invalid Array Size.");
        return;
    }
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print(arr[0]+" + "+arr[n-1]+" = "+(arr[0]+arr[n-1]));
}
}
