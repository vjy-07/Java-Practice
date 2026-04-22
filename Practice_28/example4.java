import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0){
		    System.out.print("Invalid Input");
		    return;
		}
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(j<i) System.out.print(" ");
		        else{
		            if(i==j || j==n) System.out.print("* ");
		            else System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
		for(int i=1;i<n;i++){
		    for(int j=1;j<=n;j++){
		        if(j<=n-i-1) System.out.print(" ");
		        else{
		            if(j==n || j==n-i) System.out.print("* ");
		            else System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	}
}
