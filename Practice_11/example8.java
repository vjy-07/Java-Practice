import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        while(n>0){
            int r = n%10;
            if(r%2==0){
                sum+=r;
            }
            n/=10;
        }
        System.out.print(sum);
    }
}
