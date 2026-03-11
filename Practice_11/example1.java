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
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 || n2<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        if(n1>n2){
            n1 = n1+n2-(n2=n1);
        }
        int alt=0;
        int sum =0,count=0;
        for(int i=n1+1;i<n2;i++){
            if(isPrime(i)){
                alt++;
                if(alt%2==1){
                    sum+=i;
                    count++;
                }
            }
        }
        float avg = (float)sum/count;
        if(count==0){
            System.out.print("No Prime Numbers");
        }
        else{
            System.out.printf("%.3f",avg);
        }
    }
}
