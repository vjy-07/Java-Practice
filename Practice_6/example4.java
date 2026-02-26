import java.util.Scanner;
class Main
{
    static boolean isPrime(int n){
        int fc = 0;
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
                        System.out.print(i+" ");
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.print("No Prime Factors");
            }
        }
        
    }
}