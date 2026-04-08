import java.util.Scanner;
class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n>0 && n%2==0) || (n<0 && n%2!=0) || (n==0)){
		    System.out.print("Invalid Input");
		    return;
		}
		if(n<0 && n%2==0) n=-n;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        if(j<i) System.out.print(" ");
		        else System.out.print(j);
		    }
		    for(int j=1;j<n;j++){
		        if(j<=n-i) System.out.print(n-j);
		    }
		    System.out.println();
		}
	}
}
