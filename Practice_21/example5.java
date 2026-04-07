import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        if(n<-6 || n>6){
            System.out.print("Range Exceeded");
            return;
        }
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i) System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
