import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        for(int i=1;i<=n;i++){
            if(i%2==1){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j+" ");
                }
            }
            else{
                for(int j=n-i+1;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
