import java.util.Scanner;
class Main
{
    static boolean isPs(int n){
        int val = (int)Math.sqrt(n);
        return val*val == n;
    }
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("InvaliD Input");
            return;
        }
        if(isPs(n)){
            System.out.print("Given Number is a Perfect Square.");
        }
        else System.out.print("Given Number is Not a Perfect Square.");
    }
}
