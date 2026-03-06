import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count=0;
        int sum=0;
        int a=0,b=1;
        float avg;
        if(n1<0 || n2<0){
            System.out.print("Invalid Inputs");
            return;
        }
        if(n1>n2){
            n1=n1+n2-(n2=n1);
        }
        while(a<=n2){
            if(a>=n1){
                sum+=a;
                count++;
            }
            int c= a+b;
            a=b;
            b=c;
        }
        if(count==0) System.out.print("No Fibonacci Series Values");
        else{
            avg = (float)sum/count;
            System.out.println(sum);
            System.out.println(count);
            System.out.printf("%.2f",avg);
        }
    }
}
