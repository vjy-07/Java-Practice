import java.util.Scanner;
class Main
{
    static boolean isPalindrome(int n){
        int temp = n;
        int res=0;
        while(n>0){
            int r = n%10;
            res=res*10+r;
            n/=10;
        }
        return temp==res;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.print("InvAlid Input");
            return;
        }
        if(isPalindrome(n)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
