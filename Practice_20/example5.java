import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 && n2<=0){
            System.out.print("Invalid Row and Column Values");
            return;
        }
        if(n1<=0 && n2>0){
            System.out.print("Invalid Row Value");
            return;
        }
        if(n2<=0 && n1>0){
            System.out.print("Invalid Column Value");
            return;
        }
        int t=1;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(t%n2==1){
                    System.out.print(t);
                }
                else{
                    System.out.print("*"+t);
                }
                t++;
            }
            System.out.println();
        }
    }
}
