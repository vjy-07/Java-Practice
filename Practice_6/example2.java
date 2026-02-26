import java.util.Scanner;
class Main
{
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
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=0;
        int count=0;
        if(n1<=0 || n2<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        else{
            for(int i=n1+1;i<n2;i++){
                if(isPrime(i)){
                    sum+=i;
                    count++;
                }
            }
        }
        float avg = (float)sum/count;
        System.out.printf("%.3f",avg);
    }
}