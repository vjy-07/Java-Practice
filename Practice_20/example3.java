import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 1;
        if(n<=0){
            System.out.print("Given Value is Invalid");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(t%4!=0){
                    System.out.print(t+" ");
                }
                else{
                    System.out.print("* ");
                }
                t++;
            }
            System.out.println();
        }
    }
}
