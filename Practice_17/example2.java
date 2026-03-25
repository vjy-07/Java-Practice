import java.util.Scanner;
class A{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int bP(int n){
        for(int i=n;;i--){
            if(isPrime(i)){
                return i;
            }
        }
    }
    static int aP(int n){
        for(int i=n;;i++){
            if(isPrime(i)){
                return i;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.print("InValid Input");
            return;
        }
        int bp = bP(n-1);
        int ap = aP(n+1);
        
        int bd = n-bp;
        int ad = ap-n;
        
        if(bd>ad){
            System.out.print(ap);
        }
        else if(ad>bd){
            System.out.print(bp);
        }
        else{
            System.out.println(bp);
            System.out.println(ap);
        }
    }
}
