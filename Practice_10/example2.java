import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<0 || n2<0){
            System.out.print("Invalid Inputs");
            return;
        }
        if(n1>n2){
            n1=n1+n2-(n2=n1);
        }
        int a = 0, b = 1;
        int sum=0, alt = 0, count=0;
        while(a<=n2){
            if(a>=n1){
                alt++;
                if(alt%2==1){
                    sum+=a;
                    count++;
                }
            }
            int c = a+b;
            a=b;
            b=c;
        }
        float avg = (float)sum/count;
        if(count==0){
            System.out.print("No Fibonacci Series Values");
        }
        else{
            System.out.printf("%.2f",avg);
        }
    }
}