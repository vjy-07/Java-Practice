import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1<=0 && n2>0 && n3>0){
            System.out.print("InvalId First Input");
            return;
        }
        else if(n2<=0 && n1>0 && n3>0){
            System.out.print("Invalid Second Input");
            return;
        }
        else if(n3<=0 && n1>0 && n2>0){
            System.out.print("InvaliD ThirD Input");
            return;
        }
        else if((n1<=0 && n2<=0 && n3<=0)|| (n1<=0 && n2<=0) || (n1<=0 && n3<=0) || (n2<=0 && n3<=0)){
            System.out.print("Sorry Invalid Inputs!");
            return;
        }
        int h = (n1>n2 && n1>n3)? n1 : (n2>n3?n2:n3);
        for(int i=h;;i+=h){
            if(i%n1==0 && i%n2==0 && i%n3==0){
                System.out.print(i);
                return;
            }
        }
        
    }
}
