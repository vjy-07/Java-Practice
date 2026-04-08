import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
		    System.out.print("Invalid Input");
		    return;
		}
		for(int i=1;i<=n;i++){
		    int t =0;
		    for(int j=1;j<=n;j++){
		        if(j<=n-i) System.out.print(" ");
		        else System.out.print(++t);
		    }
		    for(int j=1;j<n;j++){
		        if(j<i){
		            System.out.print(--t);
		        }
		    }
		    System.out.println();
		}
	}
}
