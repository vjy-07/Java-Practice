import java.util.Scanner;
class Main
{
    static int count(int n){
        int c = 0;
        while(n>0){
            int r = n%10;
            c++;
            n/=10;
        }
        return c;
    }
    static boolean isArmstrong(int n){
        int temp = n;
        int sum=0;
        int d= count(n);
        while(n>0){
            int r = n%10;
            sum=sum+(int)Math.pow(r,d);
            n/=10;
        }
        return temp==sum;
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n1 = Math.abs(sc.nextInt());
        int n2 = Math.abs(sc.nextInt());
        if(n1==0 || n2==0){
            System.out.print("Invalid Inputs");
            return;
        }
        if(n1>n2) n1=n1+n2-(n2=n1);
        int cnt=0;
        for(int i=n1+1;i<n2;i++){
            if(isArmstrong(i)){
                cnt++;
                if(cnt==1) System.out.print("Armstrong Numbers between the Given Values is ");
                if(cnt!=1) System.out.print(", ");
                System.out.print(i);
            }
        }
        if(cnt==0) System.out.print("No Armstrong Numbers Between Given Values");
        else System.out.print(".");
    }
}
