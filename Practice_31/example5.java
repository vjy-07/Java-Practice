import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Array Size.");
            return;
        }
        int cnt=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            int oc=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    oc++;
                }
            }
            if(oc==1) cnt++;
        }
        if(cnt==0) System.out.print("No Unique Elements");
        else System.out.print(cnt);
    }
}
