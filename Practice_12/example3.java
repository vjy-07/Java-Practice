import java.util.Scanner;
class Main
{
    static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.print("INvalid INput");
            return;
        }
        int sum=0;
        for(int i=0;i<=n;i++){
            int f = factorial(i);
            sum+=f;
            if(i!=0) System.out.print("+");
            System.out.print(f);
        }
        System.out.print("="+sum);
    }
}
