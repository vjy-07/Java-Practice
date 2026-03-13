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
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int alt=0;
        if(n1<0 || n2<0){
            System.out.print("InvAlid InPUts");
            return;
        }
        for(int i=n1;i<=n2;i++){
            if(isPalindrome(i)){
                alt++;
                if(alt%2==1){
                    if(alt!=1) System.out.print(", ");
                    System.out.print(i);
                }
            }
        }
        if(alt==0) System.out.print("No Palindrome Values");
        else{
            System.out.print(".");
        }
    }
}
