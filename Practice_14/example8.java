import java.util.Scanner;
class Main
{
    static int count(int n){
        int c=0;
        while(n>0){
            int r=n%10;
            c++;
            n/=10;
        }
        return c;
    }
    static boolean isArmstrong(int n){
        int d= count(n);
        int temp=n;
        int sum=0;
        while(n>0){
            int r = n%10;
            sum=sum+(int)Math.pow(r,d);
            n/=10;
        }
        return temp==sum;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if(isArmstrong(n)){
            System.out.print(n+" is a Armstrong Number.");
        }
        else{
            System.out.print(n+" is Not a Armstrong Number.");
        }
    }
}
