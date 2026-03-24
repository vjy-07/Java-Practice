import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 && n2<=0){
            System.out.print("Invalid Inputs.");
            return;
        }
        if(n1<=0 && n2>0){
            System.out.print("Invalid First Input");
            return;
        }
        if(n2<=0 && n1>0){
            System.out.print("InValid Second Input");
            return;
        }
        int h = n1>n2?n1:n2;
        for(int i=h;;i+=h){
            if(i%n1==0 && i%n2==0){
                System.out.print(i);
                break;
            }
        }
    }
}
