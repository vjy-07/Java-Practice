import java.util.Scanner;
public class example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b=1;
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=a;
            int c =a+b;
            a=b;
            b=c;
        }
        float avg = (float)sum/n;
        System.out.printf("%.3f",avg);
    }
}
