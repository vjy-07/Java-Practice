public import java.util.Scanner;
class Main
{
    static boolean isPrime(int n){
        int fc=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                fc++;
            }
        }
        if(fc==0 && n>1){
            return true;
        }
        return false;
    }
    static int bp(int n){
        for(int i=n;i>=2;i--){
            if(isPrime(i)){
                return i;
            }
        }
        return -1;
    }   
    static int ap(int n){
        for(int i=n; ;i++){
            if(isPrime(i)){
                return i;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int beforePrime = bp(n-1);
        int afterPrime = ap(n+1);
        int bd = n - beforePrime;
        int ad = afterPrime - n;
        
        if(bd > ad){
            System.out.print(afterPrime);
        }
        else if(bd<ad){
            System.out.print(beforePrime);
        }
        else{
            System.out.print(beforePrime+" "+afterPrime);
        }
    }
} example15 {
    
}
