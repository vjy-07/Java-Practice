import java.util.Scanner;
class A{
    static Scanner sc = new Scanner(System.in);
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int r= n%10;
            rev= rev*10+r;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        if(n==reverse(n)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}