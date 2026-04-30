import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int c = 0;
        if(n<=0){
            System.out.print("Invalid Array Size.");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                c++;
            }
        }
        if(c==0) System.out.print("No such numbers below given Key Value.");
        else System.out.print(c);
    }
}
