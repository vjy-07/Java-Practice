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
        int a =0 , b=1, alt=0;
        for(int i=1;;i++){
            alt++;
            if(alt%2==1){
                if(alt!=1) System.out.print(", ");
                System.out.print(a);
            }
            int c = a+b;
            a=b;
            b=c;
            if(alt==2*n){
                return;
            }
        }
    }
}
