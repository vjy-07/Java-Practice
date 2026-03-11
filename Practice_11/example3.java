import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev= 0;
        if(n<=0){
            System.out.print("InValid Input");
            return;
        }
        while(n>0){
            int r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        System.out.print(rev);
    }
}
