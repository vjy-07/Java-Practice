import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int t =1;
		if(n<=0){
		    System.out.print("Invalid Input");
		    return;
		}
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(i==1 || j==1 || i==n || j==n){
		            if(t<10) System.out.print("0"+t+++" ");
		            else System.out.print(t+++" ");
		        }
		        else System.out.print("   ");
		    }
		    System.out.println();
		}
	}
}
