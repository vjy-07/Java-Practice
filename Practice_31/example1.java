import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int cnt = 0;
        if(n<=5){
            System.out.print("Invalid Array Size.");
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int lc=0;
            int oc=0;
            for(int j=i;j>=0;j--){
                if(arr[i]==arr[j]){
                    lc++;
                }
            }
            if(lc==1){
                for(int k=0;k<n;k++){
                    if(arr[k]==arr[i]){
                        oc++;
                    }
                }
                if(oc>1){
                    cnt++;
                }
            }
        }
        if(cnt==0) System.out.print("No Duplicates exists");
        else System.out.print(cnt);
    }
}
