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
        int n1 =sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        int alt=0;
        if(n1==0 || n2==0){
            System.out.print("Invalid Inputs");
            return;
        }
        if(n1<0) n1=-n1;
        if(n2<0) n2=-n2;
        if(n1>n2){
            n1=n1+n2-(n2=n1);
        }
        for(int i=n1+1;i<n2;i++){
            if(isPalindrome(i)){
                alt++;
                if(alt%2==1){
                    sum+=i;
                    if(alt==1) System.out.print("Sum of Alternative Palindrome Numbers between the "+n1+" and "+n2+" is ");
                    if(alt!=1) System.out.print(" + ");
                    System.out.print(i);
                }
            }
        }
        if(sum==0) System.out.print("No Palindrome Values");
        else{
            System.out.print(" = "+sum+".");
        }
    }
}
