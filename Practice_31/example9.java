import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Array Size.");
            return;
        }
        boolean found=false;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                found=true;
                break;
            }
        }
        if(found) System.out.print("Found");
        else System.out.print("Not Found");
    }
}
