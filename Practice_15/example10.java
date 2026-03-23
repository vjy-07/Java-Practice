import java.util.Scanner;
class A{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        int cnt =0;
        for(int i=2; ; i++){
            if(isPrime(i)){
                cnt++;
                if(i!=2) System.out.print(", ");
                System.out.print(i);
                if(cnt==n){
                    return;
                }
            }
        }
    }
}
