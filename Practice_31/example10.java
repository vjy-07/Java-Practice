import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int oddCnt=0;
        if(n<=0 || n>=10){
            System.out.print("Invalid Array Size.");
            return;
        }
        int h = Integer.MIN_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>h && arr[i]%2!=0){
                h=arr[i];
            }
            if(arr[i]%2!=0) oddCnt++;
        }
        if(oddCnt>0){
        for(int i=h; ;i+=h){
            int oc=0;
            for(int j=0;j<n;j++){
                if(arr[j]%2!=0 && i%arr[j]==0){
                    oc++;
                }
            }
            if(oc==oddCnt){
                System.out.print(i);
                break;
            }
        }
        }
        if(oddCnt==0) System.out.print("No Odd Numbers");
    }
}
