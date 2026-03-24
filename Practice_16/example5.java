import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("InValid Input.");
            return;
        }
        System.out.print("Last term value is : "+(a+(n-1)*d)+".");
    }
}
