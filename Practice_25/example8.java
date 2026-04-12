import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<=0 && n2<=0){
            System.out.print("Invalid Inputs");
        }
        else if(n1<=0) System.out.print("Given Row Value is Invalid");
        else if(n2<=0) System.out.print("Given Starting Value is Invalid");
        else{
            int t = n2-1;
            for(int i=1;i<2*n1;i++){
                if(i<=n1){
                    ++t;
                    for(int j=1;j<=i;j++){
                        System.out.print(t);
                    }
                    System.out.println();
                }
                else{
                    --t;
                    for(int j=1;j<=2*n1-i;j++){
                        System.out.print(t);
                    }
                    System.out.println();
                }
            }
        }
	}
}
