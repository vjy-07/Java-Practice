import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1 = sc.nextInt();
        int count = 0;
        if(n<=0 || n1<=0){
            System.out.print("Invalid Inputs");
            return;
        }
        for(int i=n+1;i<n1;i++){
            if(i%2==0){
                count++;
                if(count%2==1){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
