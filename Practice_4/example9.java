import java.util.Scanner;
public class example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            sum+=a;
            int c = a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
}
