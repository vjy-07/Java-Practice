import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        int t = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(t-- +" ");
            }
            t=n-i;
            System.out.println();
        }
    }
}
