import java.util.*;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int cnt=0;
        int lc = Integer.MAX_VALUE;
        if(n<=5){
            System.out.print("Invalid Array Size");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int oc=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    oc++;
                }
            }
            if(oc==1){
                cnt++;
                if(arr[i]<lc){
                    lc=arr[i];
                }
            }
        }
        if(cnt==0) System.out.print("No Uniques in the Array");
        else System.out.print(lc);
    }
}
