import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;
        
        if(n==0){
            System.out.print("InvaLid Input.");
            return;
        }
        if(n<0) System.out.print("Sorry! you have Entered Negative Values.");
        else{
            for(int i=1;i<=n;i++){
                if(sum==0){
                System.out.print("Sum of 'N' Natural Numbers is ");
                    System.out.print(i);
                }
                else{
                    System.out.print(" + "+i);
                }
                sum+=i;
            }
            System.out.print(" = "+sum+".");
        }
    }
}