import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if(n%2==1){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(j%2==1){
                        System.out.print("1 ");
                    }
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
        else{
            int t=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(t%2==1){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                    t++;
                }
                t+=1;
                System.out.println();
            }
        }
    }
}
