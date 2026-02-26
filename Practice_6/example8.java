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
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count=0;
        if(n1>n2) n1=n1+n2-(n2=n1);
        if(n1<=0 || n2<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        else{
            for(int i=n1;i<=n2;i++){
                if(isPrime(i)){
                    count++;
                    if(count==1) System.out.print(i);
                    else System.out.print(", "+i);
                }
            }
        }
        
    }
}