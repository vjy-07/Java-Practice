import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=4){
            System.out.print("GiVen Value is Not More Than 4");
            return;
        }
        for(int i=1;i<=n;i++){
            int num= i;
            for(int j=1;j<=i;j++){
                if(j==1) System.out.print(num+" ");
                else System.out.print(num*j+" ");
            }
            System.out.println();
        }
    }
}
