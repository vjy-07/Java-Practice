import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int h=0;
        if(n<=0 || n>=10){
            System.out.print("Invalid Array Size.");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>h){
                h=arr[i];
            }
        }
        for(int i=h; ;i+=h){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(i%arr[j]==0){
                    cnt++;
                }
            }
            if(cnt==n){
                System.out.print(i);
                break;
            }
        }
    }
}
