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
     float sum=0;
     for(int i=0;i<n;i++){
         float val = a+(i*d);
         sum+=(1/val);
     }
     System.out.printf("%.2f",sum);
    }
}
