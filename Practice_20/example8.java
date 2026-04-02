import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t =1;
        int n1= Math.abs(sc.nextInt());
        int n2 = Math.abs(sc.nextInt());
        if(n1==0 || n2==0){
            System.out.print("Invalid Inputs");
            return;
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
    
}
