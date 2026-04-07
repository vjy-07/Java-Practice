import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0){
            System.out.print("Invalid Input");
            return;
        }
        int t = n2;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1-i+1;j++){
                System.out.print(t-- +" ");
            }
            System.out.println();
        }
    }
}
