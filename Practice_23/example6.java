import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        for(int i=1;i<=n;i++){
            int a=0,b=1;
            for(int j=1;j<=i;j++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
