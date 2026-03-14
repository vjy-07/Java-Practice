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
    static boolean armstrong(int n){
        int d = dCount(n);
        int temp = n;
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
        int n1 = Math.abs(sc.nextInt());
        int n2 = Math.abs(sc.nextInt());
        if(n1==0 || n2==0){
            System.out.print("Invalid Inputs");
            return;
        }
        if(n1>n2) n1=n1+n2-(n2=n1);
        int cnt=0;
        for(int i=n1;i<=n2;i++){
            if(armstrong(i)){
                if(i%2==1){
                    cnt++;
                    if(cnt==1) System.out.print("Odd Armstrong Numbers in the Given Range is ");
                    if(cnt!=1) System.out.print(", ");
                    System.out.print(i);
                }
            }
        }
        if(cnt==0) System.out.print("No Odd Armstrong Numbers.");
        else System.out.print(".");
    }
}
