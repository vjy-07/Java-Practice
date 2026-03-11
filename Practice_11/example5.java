import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input.");
            return;
        }
        int min = 9;
        while(n>0){
            int r = n%10;
            if(r<min){
                min=r;
            }
            n/=10;
        }
        System.out.print("Smallest Digit in a Given Number is "+min+".");
    }
}
