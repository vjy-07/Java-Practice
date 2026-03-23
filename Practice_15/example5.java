import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if((n&1)==0) System.out.print("Even");
        else System.out.print("Odd");
    }
}
