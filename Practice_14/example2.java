import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=0|| b<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        int res=1;
        for(int i=0;i<b;i++){
            res*=a;
        }
        System.out.print(a+" Power "+b+" value is "+res+".");
    }
}
