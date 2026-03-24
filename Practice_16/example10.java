import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 && n2<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        else if(n1<=0 && n2>0){
            System.out.print("Invalid First Input");
            return;
        }
        else if(n2<=0 && n1>0){
            System.out.print("Invalid Second Input.");
            return;
        }
        int l = n1<n2?n1:n2;
        for(int i=l;;i--){
            if(n1%i==0 && n2%i==0){
                System.out.print(i);
                return;
            }
        }
    }
}
