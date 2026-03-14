import java.util.Scanner;
class Main
{
    static int dCount(int n){
        int cnt=0;
        while(n>0){
            int r = n%10;
            cnt++;
            n/=10;
        }
        return cnt;
    }
    static boolean isArmstrong(int n){
        int d = dCount(n);
        int temp = n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(int)Math.pow(r,d);
            n/=10;
        }
        return temp==sum;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if(isArmstrong(n)){
            System.out.print("Armstrong Number");
        }else{
            System.out.print("Not a Armstrong Number");
        }
    }
}
