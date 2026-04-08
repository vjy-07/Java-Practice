import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Math.abs(sc.nextInt());
		if(n==0){
		    System.out.print("Invalid Input");
		    return;
		}
		int t=1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(j<=n-i) System.out.print("  ");
		        else {
		            if(t<10) System.out.print("0"+t++ +"  ");
		            else System.out.print(t++ +"  ");
		        }
		    }
		    System.out.println();
		}
	}
}
