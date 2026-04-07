import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 && n2<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        else if(n1<=0){
            System.out.print("Invalid Row Input");
            return;
        }
        else if(n2<=0){
            System.out.print("Invalid Starting Value");
            return;
        }
        else{
            int t=n2;
            for(int i=1;i<=n1;i++){
                int sum=0;
                for(int j=1;j<=i;j++){
                    System.out.print(t +" ");
                    sum+=t;
                    t++;
                }
                System.out.print("- "+sum);
                System.out.println();
            }
        }
    }
}
