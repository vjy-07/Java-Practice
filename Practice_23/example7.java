import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        int t =1;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                int temp = t;
                for(int j=1;j<=i;j++){
                    if(j!=1) System.out.print("*");
                    System.out.print(temp);
                    temp++;
                }
            }
            else{
                int val = t+i-1;
                for(int j=1;j<=i;j++){
                    if(j!=1) System.out.print("*");
                    System.out.print(val--);
                }
            }
            t=t+i;
            System.out.println();
        }
    }
}
