import java.util.Scanner;
class Main
{
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        if(n<0){
            n = n*(-1);
        }
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        else{
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    if(isPrime(i)){
                        count++;
                        System.out.print(i+" ");
                    }
                }
            }
        }
        if(count==0){
            System.out.print("No Prime Factors");
        }
        
    }
}