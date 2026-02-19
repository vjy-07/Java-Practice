import java.util.Scanner;
public class example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0, b=1;
        int sum = 0;
        for(int i=1;i<=2*n;i++){
            if(i%2==1){
                sum+=a;
            }
            int c= a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
}
