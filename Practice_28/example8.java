import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        for(int i=1;i<=n;i++){
            if(n%2==1){
                for(int j=1;j<=n;j++){
                    if(j==(n/2)+1 || i==(n/2)+1){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j==(n/2) || j==(n/2)+1 || i==(n/2) || i==(n/2)+1){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
