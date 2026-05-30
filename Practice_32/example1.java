import java.util.*;
class A
{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int nextPrime(int n){
        for(int i=n+1;;i++){
            if(isPrime(i)){
                return i;
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        int prime = 1, fib1=0, fib2=1;
        boolean prm = false;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(prm==false){
                    prime=nextPrime(prime);
                    System.out.print(prime+" ");
                    prm = true;
                }
                else{
                    System.out.print(fib1+" ");
                    int fib3 = fib1+fib2;
                    fib1=fib2;
                    fib2=fib3;
                    prm=false;
                }
            }
            System.out.println();
        }
    }
}
