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
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        int cnt=0;
        int alt=0;
        if(n1<=0 || n2<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        for(int i=n1+1;i<n2;i++){
            if(isPrime(i)){
                alt++;
                if(alt%2==1){
                    sum+=i;
                    cnt++;
                }
            }
        }
        if(cnt==0){
            System.out.print("No Prime Numbers");
        }
        else{
            System.out.print(sum);
        }
    }
}
