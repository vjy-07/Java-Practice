import java.util.Scanner;
class A{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int count(int n){
        int c = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if(isPrime(n)){
            int cnt = count(n);
            System.out.print("Prime, Position = "+ cnt+".");
        }
        else{
            System.out.print("Not a Prime");
        }
    }
}
