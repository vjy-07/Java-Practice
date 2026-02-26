import java.util.Scanner;
class A{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        else{
            if(isPrime(n)){
                System.out.print("Prime Number");
            }
            else{
                System.out.print("Not a Prime Number");
            }
        }
    }
}