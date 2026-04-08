import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Oh! I got Zero(0)");
            return;
        }
        for(int i=1;i<=n;i++){
            int t = i;
            for(int j=1;j<=n;j++){
                if(j<=n-i) System.out.print(" ");
                else System.out.print(t--);
            }
            for(int j=1;j<n;j++){
                if(j<i) System.out.print(++t+1);
            }
            System.out.println();
        }
    }
}
