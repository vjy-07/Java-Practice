import java.util.*;
class Main
{   
    static boolean isPalindrome(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            int r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        return rev==n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int maxsum=0, maxlen=0;
        if(n<5){
            System.out.print("Invalid Array Size");
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0,e=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0, len=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    len++;
                }
                if(len>1){
                    if(isPalindrome(sum) && sum>maxsum && len>maxlen){
                        maxlen=Math.max(maxlen,len);
                        maxsum=Math.max(maxsum,sum);
                        s=i;
                        e=j;
                    }
                }
            }
        }
        if(maxsum==0){
            System.out.print("No Sub Arrays Found");
            return;
        }
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
