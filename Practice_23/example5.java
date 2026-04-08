import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
            return;
        }
        if(n<1 || n>26){
            System.out.print("Invalid Row Value");
            return;
        }
        for(int i=1;i<=n;i++){
            int t = n;
            for(int j=1;j<=n;j++){
                if(j<=n-i) System.out.print("  ");
                else{
                    char ch = (char)(t+64);
                    System.out.print(ch+" ");
                    t--;
                }
            }
            System.out.println();
        }
        
    }
}
