import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid input.");
            return;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(i!=0) System.out.print(" + ");
            System.out.print(a+(i*d));
            sum+=(a+(i*d));
        }
        System.out.print(" = "+sum+".");
    }
}
