import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 0, b=1;
        int alt=0;
        if(n==0){
            System.out.print("Invalid Input");
        }
        if(n<0){
            n=-n;
        }
        for(int i=1;i<=2*n;i++){
            alt++;
            if(alt%2==1){
                if(i!=1) System.out.print(", ");
                System.out.print(a);
            }
            int c= a+b;
            a=b;
            b=c;
        }
    }
}
