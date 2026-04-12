import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input.");
            return;
        }
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print(i*j+" ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print(i*j+" ");
                }
                System.out.println();
            }
        }
    }
}
