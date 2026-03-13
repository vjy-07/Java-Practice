import java.util.Scanner;
class Main
{
    static int reverse(int n){
        int temp = n;
        int res=0;
        while(n>0){
            int r = n%10;
            res=res*10+r;
            n/=10;
        }
        return res;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.print("Invalid Input");
            return;
        }
        if(n==0){
            System.out.print("Zero");
            return;
        }
        int rev = reverse(n);
        if(rev==n){
            System.out.print("Given Number is Palindrome");
        }
        else{
            System.out.print("Reverse of a Given Number is "+rev);
        }
    }
}
