import java.util.Scanner;
class Main{
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}