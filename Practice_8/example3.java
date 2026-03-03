import java.util.Scanner;
class A{
    static Scanner sc = new Scanner(System.in);
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int r= n%10;
            rev= rev*10+r;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count=0;
        for(int i=n1;i<=n2;i++){
            if(i==reverse(i)){
                count++;
            }
        }
        System.out.print(count);
    }
}