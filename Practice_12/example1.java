import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if(n<0){
            System.out.print("Invalid InPut");
            return;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print(fact);
    }
}
