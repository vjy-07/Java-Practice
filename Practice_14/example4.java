import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=0 || b<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        System.out.print(a+" Power "+b+" value is "+(int)Math.pow(a,b)+".");
    }
}
