import java.util.Scanner;
class Main
{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        for(int i=1;i<=n;i++){
            int p=2;
            int count=1;
            while(count<=i){
                if(isPrime(p)){
                    System.out.print(p+" ");
                    count++;
                }
                p++;
            }
            System.out.println();
        }
    }
}
