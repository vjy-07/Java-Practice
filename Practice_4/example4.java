import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("not a prime number");
        }
    }
    static boolean isPrime(int x){
        int fc = 0;
        for(int i=2;i<=(int)Math.sqrt(x);i++){
            if(x%i==0){
                fc++;
            }
        }
        if(fc==0 && x>1){
            return true;
        }
        else{
            return false;
        }
    }
}