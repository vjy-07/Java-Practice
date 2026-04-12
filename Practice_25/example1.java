import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(n<10){
                    if(j<=n-i){
                        System.out.print(" ");
                    }
                    else System.out.print(i+" ");
                }
                else{
                    if(j<=n-i){
                        System.out.print("  ");
                    }
                    else{
                        if(i<10) System.out.print(" "+i+"  ");
                        else System.out.print(i+"  ");
                    }
                }
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if(n<10){
                    if(j<=i) System.out.print(" ");
                    else System.out.print(n-i+" ");
                }
                else{
                    if(j<=i){
                        System.out.print("  ");
                    }
                    else{
                        if(n-i>=10) System.out.print(n-i+"  ");
                        else System.out.print(" "+(n-i)+"  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
