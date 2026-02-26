import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a =0, b=1;
        while(a<n){
            int c= a+b;
            a=b;
            b=c;
        }
        if(a==n){
            System.out.print("fibonacci");
        }
        else{
            System.out.print("not a fibonacci");
        }
    }
}