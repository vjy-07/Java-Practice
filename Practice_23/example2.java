import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        int t=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(t%2);
                t++;
            }
            System.out.println();
        }
    }
}
