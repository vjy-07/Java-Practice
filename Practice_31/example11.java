import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int cnt = 0;
        if(n<=6){
            System.out.print("Invalid Array Size");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int rc=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    rc++;
                }
            }
            if(rc>cnt && rc>1){
                ans= arr[i];
                cnt=rc;
            }
        }
        if(ans==0) System.out.print("NO such number exists");
        else System.out.print(ans);
    }
}
