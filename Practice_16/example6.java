import java.util.Scanner;

class Main
{
    public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int d = sc.nextInt();
     int n = sc.nextInt();
     if(n<=0){
         System.out.print("Invalid Input.");
         return;
     }
     for(int i=0;i<n;i++){
         if(i!=0) System.out.print(", ");
         System.out.print(a+(i*d));
     }
     System.out.print(".");
    }
}
