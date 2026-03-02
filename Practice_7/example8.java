import java.util.Scanner;
class A{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int r = n%10;
            if(isPrime(r)){
                System.out.print(r+" ");
            }
            n/=10;
        }
    }
}