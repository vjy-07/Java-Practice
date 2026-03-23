import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        int sum=0;
        for(int i=n;i>=1;i--){
            if(i!=n) System.out.print(" + ");
            System.out.print(i*i);
            sum+=(i*i);
        }
        System.out.print(" = "+sum);
    }
}