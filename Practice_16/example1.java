import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        for(int i=0;i<n;i++){
            float val = a+(i*d);
            if(i!=0) System.out.print(", ");
            System.out.printf("%.2f",1/val);
        }
    }
}
