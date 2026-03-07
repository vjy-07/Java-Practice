import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>n2){
            n1=n1+n2-(n2=n1);
        }
        for(int i=n1;i<=n2;i++){
            if(i!=n1){
                System.out.print(", ");
            }
            System.out.print(i+"*"+(i+1));
        }
        System.out.println();
        for(int i=n1;i<=n2;i++){
            if(i!=n1){
                System.out.print(", ");
            }
            System.out.print(i*(i+1));
        }
    }
}
