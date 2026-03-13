import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input.");
            return;
        }
        int lowest=9, highest=0;
        while(n>0){
            int r= n%10;
            if(r<lowest){
                lowest=r;
            }
            if(r>highest){
                highest=r;
            }
            n/=10;
        }
        int span = highest-lowest;
        System.out.println("Lowest Digit in a Given Number is "+lowest+".");
        System.out.println("Highest Digit in a Given Number is "+highest+".");
        System.out.println("Highest Span in a Given Number is "+span+".");
    }
}
