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
    public static void main(String args[])
    {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if(isPrime(n)){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not a Prime Number");
        }
    }
}
